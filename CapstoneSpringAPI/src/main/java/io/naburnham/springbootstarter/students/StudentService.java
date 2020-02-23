package io.naburnham.springbootstarter.students;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import io.naburnham.springbootstarter.exceptions.NotFoundException;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Page<Student> getAllStudents(int page, int size) {
		
		Pageable pageable = PageRequest.of(page-1, size, Sort.by("id"));

		return studentRepository.findAll(pageable);
	}
	
	public Optional<Student> getStudent(int id) {
		
		Optional<Student> student = studentRepository.findById(id);

		if (student.isPresent()) {
			return student;			
		} else {
			throw new NotFoundException(Integer.toString(id));
		}
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void updateStudent(int id, Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	
	public Page<Student> getStudentsByGPA() {
		Pageable pageable = PageRequest.of(0, 5, Sort.by(Direction.DESC, "gradePointAverage"));
		
		return studentRepository.findAll(pageable);
	}
	
}
