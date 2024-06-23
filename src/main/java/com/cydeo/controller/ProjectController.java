package com.cydeo.controller;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.entity.ResponseWrapper;
import com.cydeo.service.ProjectService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/api/v1/project")

public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    @RolesAllowed({"Manager","Admin"})
    public ResponseEntity<ResponseWrapper> getProjects(){

        return ResponseEntity.ok(new ResponseWrapper("project List :",projectService.listAllProjects(), HttpStatus.OK));
    }

    @GetMapping("/{code}")
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> getProjectByCode(@PathVariable("code") String code){

        ProjectDTO projectDTO= projectService.getByProjectCode(code);

        return ResponseEntity.ok(new ResponseWrapper("project List :",projectDTO, HttpStatus.OK));
    }

    @PostMapping
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> createProject(@RequestBody ProjectDTO projectDTO){

        projectService.save(projectDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("project created :",projectDTO, HttpStatus.CREATED));
    }

    @PutMapping
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> updateUser(@RequestBody ProjectDTO projectDTO){
        projectService.update(projectDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("project updated:",projectDTO, HttpStatus.CREATED));

    }

    @DeleteMapping("/{code}")
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> deleteProjectByCode(@PathVariable("code") String code){

        projectService.getByProjectCode(code);

        return ResponseEntity.ok(new ResponseWrapper("deleted",HttpStatus.OK));

    }

    @GetMapping("/manager/project-status")
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> getProjectByManager(){
        return ResponseEntity.ok(new ResponseWrapper("project are retrieve", projectService.listAllProjectDetails(),HttpStatus.OK));
    }

    @PutMapping("/manager/complete/{code}")
    @RolesAllowed("Manager")
    public ResponseEntity<ResponseWrapper> managerCompleteProject(@PathVariable("code") String code){
        projectService.complete(code);
        return ResponseEntity.ok(new ResponseWrapper("project completed",HttpStatus.OK));
    }





}
