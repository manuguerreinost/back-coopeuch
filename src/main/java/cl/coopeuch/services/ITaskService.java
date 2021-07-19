package cl.coopeuch.services;

import java.util.List;

import cl.coopeuch.entities.Task;

public interface ITaskService {
	public List<Task> findAll();
	public Task findById(Long id);
	public void deleteById(Long id);
	public Task save(Task task);

}
