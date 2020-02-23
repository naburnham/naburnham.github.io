package io.naburnham.springbootstarter.courses;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.naburnham.springbootstarter.exceptions.ApiRequestException;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(method=RequestMethod.GET, value="/courses")
	public Page<Course> getAllCourses(@RequestParam  (defaultValue = "1") int page, @RequestParam (defaultValue = "5") int size) {
		
		if (size < 1 || page < 1) {
			throw new ApiRequestException("Cannot have parameters less than 1.");
		}
		
		try {
			return courseService.getAllCourses(page, size);
		} catch (IllegalArgumentException e) {
			throw new ApiRequestException("Unable to process request.");
		}
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		return courseService.getCourseById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addOrUpdateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/courses")
	public void updateCourse(@RequestBody Course course) {
		courseService.addOrUpdateCourse(course);
	}
	
	// Delete Course
	@RequestMapping(method=RequestMethod.DELETE, value="/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
