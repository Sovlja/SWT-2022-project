package rs.ac.uns.ftn.svtvezbe07.model.dto;

import rs.ac.uns.ftn.svtvezbe07.model.entity.Administrator;

public class AdministratorDTO extends UserDTO{
    private Long adminId;

    public AdministratorDTO (){}

    public AdministratorDTO (Administrator administrator) {
        this.adminId = administrator.getAdminID();
    }
}
