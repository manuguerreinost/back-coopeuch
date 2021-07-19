package cl.coopeuch.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.coopeuch.entities.Task;
import cl.coopeuch.services.ITaskService;

@CrossOrigin
@RestController
public class TaskController {

	@Autowired
	private ITaskService taskService;
	
	
	@GetMapping("/api/tasks")
	public List<Task> listTasks(){
		return taskService.findAll();
	} 
	
	@GetMapping("/api/tasks/{id}")
	public Task findTask(@PathVariable Long id){
		return taskService.findById(id);
	}
	
	@PostMapping("/api/tasks")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Task createTask(@Valid @RequestBody Task task){
		return taskService.save(task);
	}
	
	
	@PutMapping("/api/tasks/{id}")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Task editTask(@Valid @RequestBody Task task, @PathVariable Long id){
		
		Task taskDB = taskService.findById(id);
		
		taskDB.setDescription(task.getDescription());
		taskDB.setVigent(task.isVigent());
		
		return taskService.save(taskDB);
		
	}
	
	@DeleteMapping("/api/tasks/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteTask(@PathVariable Long id) {
		taskService.deleteById(id);
	}
		
}

