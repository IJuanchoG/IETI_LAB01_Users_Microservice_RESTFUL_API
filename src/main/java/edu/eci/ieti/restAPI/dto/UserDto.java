package edu.eci.ieti.restAPI.dto;


import edu.eci.ieti.restAPI.data.User;

/**
 * The type User dto.
 */
public class UserDto {

    /**
     * The Name.
     */
    private String name;
    /**
     * The Last name.
     */
    private String lastName;
    /**
     * The Email.
     */
    private String email;

    /**
     * Instantiates a new User dto.
     */
    public UserDto(){
    }

    /**
     * Instantiates a new User dto.
     *
     * @param name     the name
     * @param lastName the last name
     * @param email    the email
     */
    public UserDto(String name, String lastName, String email){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser(){
        return new User(this);
    }
}
