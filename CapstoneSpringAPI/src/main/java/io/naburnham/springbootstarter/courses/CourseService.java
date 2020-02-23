package io.naburnham.springbootstarter.courses;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import io.naburnham.springbootstarter.exceptions.NotFoundException;


@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public Page<Course> getAllCourses(int page, int size) {

		Pageable pageable = PageRequest.of(page-1, size, Sort.by("id"));
		
		return courseRepository.findAll(pageable);
	}
	
	public Optional<Course> getCourseById(String id) {

		Optional<Course> course = courseRepository.findById(id);
		
		if (course.isPresent()) {
			return course;
		} else {
			throw new NotFoundException(id);
		}
	}
	
	public void addOrUpdateCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
