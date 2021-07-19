package cl.coopeuch.repositories;

import org.springframework.data.repository.CrudRepository;

import cl.coopeuch.entities.Task;

public interface ITaskRepository extends CrudRepository<Task, Long>{

}
