package io.naburnham.springbootstarter.students;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

}
