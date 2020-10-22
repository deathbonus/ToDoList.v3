package com.deathbonus.todolist001;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tasklists", path = "tasklists")
public interface TaskListsRepository extends PagingAndSortingRepository<TaskList, Long> {
    List<TaskList> findByName(@Param("name") String name);
}
