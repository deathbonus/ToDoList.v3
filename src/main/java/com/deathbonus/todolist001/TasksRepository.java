package com.deathbonus.todolist001;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tasks", path = "tasks")
public interface TasksRepository extends PagingAndSortingRepository<Task, UUID> {
    List<Task> findByName(@Param("name") String name);
}
