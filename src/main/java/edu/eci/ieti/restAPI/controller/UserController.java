package edu.eci.ieti.restAPI.controller;

import edu.eci.ieti.restAPI.data.User;
import edu.eci.ieti.restAPI.dto.UserDto;
import edu.eci.ieti.restAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type User controller.
 */
@RestController
@RequestMapping( "/v1/user" )
public class UserController
{
    private final UserService userService;

    /**
     * Instantiates a new User controller.
     *
     * @param userService the user service
     */
    public UserController(@Autowired UserService userService )
    {
        this.userService = userService;
    }

    /**
     * All response entity.
     *
     * @return the response entity
     */
    @GetMapping
    public ResponseEntity<List<User>> all()
    {
        return new ResponseEntity<>(userService.all(), HttpStatus.OK);
    }

    /**
     * Find by id response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById(@PathVariable String id )
    {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }


    /**
     * Create response entity.
     *
     * @param userDto the user dto
     * @return the response entity
     */
    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto )
    {

        return new ResponseEntity<>(userService.create(userDto.getUser()), HttpStatus.CREATED);
    }

    /**
     * Update response entity.
     *
     * @param userDto the user dto
     * @param id      the id
     * @return the response entity
     */
    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable String id )
    {
        User aux = userDto.getUser();
        aux.setId(id);
        return new ResponseEntity<>(userService.update(aux,id), HttpStatus.OK);
    }

    /**
     * Delete response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        return new ResponseEntity<>(userService.deleteById(id), HttpStatus.OK);
    }
}
