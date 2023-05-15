package com.inposterProject.inposter.model.dto;

import com.inposterProject.inposter.model.entity.User;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class UserDTO {

    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;
    @NotBlank
    private LocalDateTime lastLogin;
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;


    public UserDTO(User createdUser) {
        this.id = createdUser.getId();
        this.username = createdUser.getUsername();
        this.email = createdUser.getEmail();
        this.lastLogin = createdUser.getLastLogin();
        this.firstname = createdUser.getFirstname();
        this.lastname = createdUser.getLastname();
    }
    public UserDTO (){}
}
