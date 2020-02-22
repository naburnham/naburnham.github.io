## CS-499 Computer Science Capstone Final Project

### Self-Assessment

### The Code Review
<iframe width="560" height="315" src="https://www.youtube.com/embed/Aj5iu-LbCfo" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

### Software Design and Engineering

<p>The artifact I chose for the Software Design and Engineering component of this course was the college course and registration program from IT-315, Object Oriented Analysis and Design, to design as a REST API (similar to the one from CS-340, Client/Server Development).</p>
<p>I included this artifact in my portfolio because it shows my ability to plan and implement a program. I also implemented it in Java Spring Boot to demonstrate that I could learn and utilize different development stacks. Thus far, I’ve incorporated the web api handling of the project. Next module, I will have introduced the MySQL database back end. This will allow me to appropriately incorporate the services. Currently, my service handling uses hard coded lists from a temporary class in the program. Implement MySQL will allow me to better store this information in a database. It will also allow me to improve and add additional enhancements in the future (such as returning a student’s class schedule).</p>
<p>I believe my initial development in this project touches upon three of the course objectives. I’ve shown I can use different techniques, skills, and tools to accomplish goals. For instance, my original REST API from CS-340 used Python and the Bottle web framework. This project is utilizing Java and the Spring Boot web framework. Additionally, I’ve met the objective of designing, developing, and delivering coherent and technically sound communications. Lastly, I’ve begun to touch on many of the security aspects of design. I’ve followed better design practices to ensure no warnings or errors remain in the code. And all imports are for needed components, rather than the poor practice of wildcard imports.</p>
<p>In programming this artifact, I’ve realized that implementing authentication and authorization methods were things I have not touched on much throughout my degree. This has been the largest challenge so far and I’ve yet to complete its incorporation into my project. Another aspect I feel I’ve fell short on is much of the error handling thus far. This will change as I start to fully flesh out the database service section.</p>


### Algorithms and Data Structures

<p>I selected this artifact to improve because I thought it would best demonstrate algorithm design and data structure choice. The major improvement from the original artifact to know is pagination. Instead of returning each row of data, it returns a limited selection instead. This reduces the load for the user by loading smaller amounts of data instead.
In improving this portion of the artifact, I showed that I can design a computing solution to solve a given problem using algorithmic principles while managing trade-offs in design choices.</p>
<p>While implementing the pagination, I learned that there were multiple different ways to paginate from a database, like Keyset or Seek (Gilling, 2019). Because I haven’t implemented the database yet, I faced a few challenges while implementing it with my example development data. An example of this includes have limits or offsets that were to large. This would cause errors as I was trying to get data outside of the bounds of the array. This was worth learning, as I know how to handle it now if MySQL has similar limitations.</p>

<p>
Reference<br />
Gilling, D. (2019, April 23). Rest api design: Filtering, sorting, and pagination. Retrieved from https://www.moesif.com/blog/technical/api-design/REST-API-Design-Filtering-Sorting-and-Pagination/
</p>

### Database

<p>I selected this artifact to improve because I thought it would best demonstrate algorithm design and data structure choice. The major improvement from the original artifact to know is pagination. Instead of returning each row of data, it returns a limited selection instead. This reduces the load for the user by loading smaller amounts of data instead.</p>
<p>In improving this portion of the artifact, I showed that I can design a computing solution to solve a given problem using algorithmic principles while managing trade-offs in design choices.</p>
<p>While implementing the pagination, I learned that there were multiple different ways to paginate from a database, like Keyset or Seek (Gilling, 2019). Because I haven’t implemented the database yet, I faced a few challenges while implementing it with my example development data. An example of this includes have limits or offsets that were to large. This would cause errors as I was trying to get data outside of the bounds of the array. This was worth learning, as I know how to handle it now if MySQL has similar limitations.</p>

