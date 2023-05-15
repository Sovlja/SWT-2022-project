package com.inposterProject.inposter.model.dto;

import com.inposterProject.inposter.model.entity.Administrator;

public class AdministratorDTO extends UserDTO{
    private Long adminId;

    public AdministratorDTO (){}

    public AdministratorDTO (Administrator administrator) {
        this.adminId = administrator.getAdminID();
    }
}
