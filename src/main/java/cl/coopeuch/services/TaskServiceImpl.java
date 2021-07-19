package cl.coopeuch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.coopeuch.entities.Task;
import cl.coopeuch.repositories.ITaskRepository;

@Service
public class TaskServiceImpl implements ITaskService{
	
	@Autowired
	private ITaskRepository taskRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Task> findAll() {
		// TODO Auto-generated method stub
		return (List<Task>) taskRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Task findById(Long id) {
		// TODO Auto-generated method stub
		return taskRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		taskRepository.deleteById(id);
		
	}

	@Override
	@Transactional
	public Task save(Task task) {
		// TODO Auto-generated method stub
		return taskRepository.save(task);
	}

}
