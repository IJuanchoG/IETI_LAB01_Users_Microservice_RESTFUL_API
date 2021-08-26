package edu.eci.ieti.restAPI.services;

import edu.eci.ieti.restAPI.data.User;

import java.util.List;

/**
 * The interface User service.
 */
public interface UserService
{
    /**
     * Create user.
     *
     * @param user the user
     * @return the user
     */
    User create(User user );

    /**
     * Find by id user.
     *
     * @param id the id
     * @return the user
     */
    User findById( String id );

    /**
     * All list.
     *
     * @return the list
     */
    List<User> all();

    /**
     * Delete by id boolean.
     *
     * @param id the id
     * @return the boolean
     */
    boolean deleteById( String id );

    /**
     * Update user.
     *
     * @param user   the user
     * @param userId the user id
     * @return the user
     */
    User update( User user, String userId );
}