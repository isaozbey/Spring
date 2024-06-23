package com.cydeo.controller;

import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.ResponseWrapper;
import com.cydeo.enums.Status;
import com.cydeo.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> getTasks(){

        return ResponseEntity.ok(new ResponseWrapper("Task List",taskService.listAllTasks(), HttpStatus.OK));
    }

    @GetMapping("/{id}")
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> getTaskById(@PathVariable("id") Long id){
        return ResponseEntity.ok(new ResponseWrapper("Task List",taskService.findById(id), HttpStatus.OK));
    }

    @PostMapping
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> createTask(@RequestBody TaskDTO taskDTO){
        taskService.save(taskDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("Task Created: ",HttpStatus.CREATED));
    }

    @DeleteMapping
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> deleteTask(@PathVariable("id") Long id){
        taskService.delete(id);
        return  ResponseEntity.status(HttpStatus.OK).body(new ResponseWrapper("Task is deleted: ",HttpStatus.OK));
    }

    @PutMapping
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> updateTask(@RequestBody TaskDTO taskDTO){
        taskService.update(taskDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("Task Updated: ",HttpStatus.CREATED));
    }

    @GetMapping("/employee/pending-tasks")
    @RolesAllowed("Employee")
    public ResponseEntity<ResponseWrapper> employeePendingTask(){

        return ResponseEntity.ok(new ResponseWrapper("Pending Task",taskService.listAllTasksByStatusIsNot(Status.COMPLETE),HttpStatus.OK));

    }

    @PutMapping("/employee/update")
    @RolesAllowed("Employee")
    public ResponseEntity<ResponseWrapper> employeeUpdateTask(@RequestBody TaskDTO taskDTO){
        taskService.updateStatus(taskDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("Status Updated: ",HttpStatus.CREATED));

    }

    @GetMapping("/employee/archive")
    @RolesAllowed("Employee")
    public ResponseEntity<ResponseWrapper> employeeArchivedTask(){

        List<TaskDTO> taskDTOS =taskService.listAllTasksByStatus(Status.COMPLETE);

        return ResponseEntity.ok(new ResponseWrapper("Archived Tasks",HttpStatus.OK));

    }

}
