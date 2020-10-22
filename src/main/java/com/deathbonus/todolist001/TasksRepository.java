package com.deathbonus.todolist001;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface TasksRepository extends PagingAndSortingRepository<Task, Long> {
    List<Task> findByName(@Param("name") String name);
}
