package edu.eci.ieti.restAPI.data;

import edu.eci.ieti.restAPI.dto.UserDto;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.UUID;

/**
 * The type User.
 */
public class User {

    /**
     * The Id.
     */
    private String id;
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
     * The CreatedAt.
     */
    private String createdAt;

    /**
     * Instantiates a new User.
     */
    public User() {
        this.id = "";
        this.name = "";
        this.lastName = "";
        this.email = "";
        this.createdAt = "";
    }

    /**
     * Instantiates a new User.
     *
     * @param id        the id
     * @param name      the name
     * @param lastName  the last name
     * @param email     the email
     * @param createdAt the created at
     */
    public User(String id, String name, String lastName, String email, String createdAt) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
    }

    public User(UserDto userDto) {
        this.id = UUID.randomUUID().toString();
        this.name = userDto.getName();
        this.lastName = userDto.getLastName();
        this.email = userDto.getEmail();
        this.createdAt = LocalDate.now().toString();
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
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

    /**
     * Gets created at.
     *
     * @return the created at
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets created at.
     *
     * @param createdAt the created at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
