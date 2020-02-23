package io.naburnham.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CapstoneApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneApiApp.class, args);
	}

}

/*
*	TODO: 
*		-- Try to get Enrollment Staff vs Student Verification	(Not sure if I'll be able to do this for Java REST API without developing web pages)
*															(May be about to use O.Auth or Basic Auth with Postman) Look into this
*		
*		
*
*		

*	
*		Need to add Student Course Registration
*
*		Student needs way to track courses
*			-- Not sure if need to use table to connect student id to course ids or classes as list in student (Might be confusing MySQL operability with MongoDB)
*
*	OPTIONAL:
*		Add JUnit tests
*		Student needs a way to generate an id
*		Student needs a way to auto-complete GPA
*		Would like to insert a way to show student schedules and class lists
*
*	COMPLETED:
*		MODULE 3:
*		Add all CRUD operations for Face to Face and Online Classes
*		Need to get all classes of a particular course
*		
*
*		MODULE 4:
*		Add pagination to search results	(Data Structures & Algorithms)
*			// Currently uses the Example Data lists and sublists. MySQL will call data with LIMIT and OFFSET appropriately
*
*		MOD 5:
*			Connect to MySQL Database		(Database)
*			Update pagination for Database (Pageables)
*
*			Optional:
*				Sort descending by GPA
*
*		Need to validate user input (Post, update, delete) (May be easier when implementing the database)
*			-- SpringBoot handles this
*
*Need proper error handling and user messages		(Implement API errors (ie. 400 Bad Request, 500 server errors, etc)
*			-- Error handling has started to be implemented for gets.
*			-- Continue adding appropriate error handling for POST, PUT, and DELETE (ie. Not Found)
*/