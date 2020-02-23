package io.naburnham.springbootstarter.students;

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
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET, value="/students")
	// Using @RequestParam allows for pagination of results
	// Set default value to allow to results in search
	public Page<Student> getAllStudents(@RequestParam  (defaultValue = "1") int page, @RequestParam (defaultValue = "5") int size) {
		
		// Throw exception for parameters less than one
		if (size < 1 || page < 1) {
			throw new ApiRequestException("Cannot have parameters less than 1.");
		}
		
		try {
			return studentService.getAllStudents(page, size);
		} catch (IllegalArgumentException e) {
			// Handles program error if run out of pages
			throw new ApiRequestException("Unable to process request.");
		}
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/students/{id}")
	public Optional<Student> getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody Student student) {
		studentService.updateStudent(id, student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/students/gpa")
	public Page<Student> getStudentsByGPA() {
		return studentService.getStudentsByGPA();
	}
	
}
