package io.naburnham.springbootstarter.courses;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, String> {

}
