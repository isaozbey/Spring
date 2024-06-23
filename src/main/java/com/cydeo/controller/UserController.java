package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import com.cydeo.entity.ResponseWrapper;
import com.cydeo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@Tag(name = "UserController",description = "USER API")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @RolesAllowed("Admin")
    @Operation(summary = "Get Users")
    public ResponseEntity<ResponseWrapper> getUsers(){

        List<UserDTO> userDTOList = userService.listAllUsers();

       return ResponseEntity.ok(new ResponseWrapper("User list retrieved : ",userDTOList,HttpStatus.OK));

    }

    @GetMapping("/{username}")
    @RolesAllowed("Admin")
    @Operation(summary = "Get User by username")
    public ResponseEntity<ResponseWrapper> getByUsername(@PathVariable("username") String username){

        UserDTO userDTO = userService.findByUserName(username);

        return ResponseEntity.ok(new ResponseWrapper("User retrieved: ",userDTO,HttpStatus.OK));

    }

    @PostMapping
    @RolesAllowed("Admin")
    @Operation(summary = "Create User")
    public ResponseEntity<ResponseWrapper> createUser(@RequestBody UserDTO user){
        userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("User is successfully created",HttpStatus.CREATED));
    }

    @PutMapping
    @RolesAllowed("Admin")
    @Operation(summary = "Update User")
    public ResponseEntity<ResponseWrapper> updateUser(@RequestBody UserDTO userDTO){
        userService.update(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("User created",HttpStatus.CREATED));
    }

    @DeleteMapping("/{username}")
    @RolesAllowed("Admin")
    public ResponseEntity<ResponseWrapper> deleteUser(@PathVariable("username") String username){
        userService.deleteByUserName(username);
        return ResponseEntity.ok(new ResponseWrapper("Deleted",HttpStatus.OK));
        //return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ResponseWrapper("Deleted",HttpStatus.OK));
    }
}
