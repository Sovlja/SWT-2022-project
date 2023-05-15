package com.inposterProject.inposter.model.dto;

import com.inposterProject.inposter.model.entity.Group;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class GroupDTO {

    private Long id;
    @NotNull
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private LocalDateTime creationTime;
    @NotNull
    private boolean isSuspended;
    private String suspendedReason;

    public GroupDTO (Group group) {
        this.id = group.getId();
        this.name = group.getName();
        this.description = group.getDescription();
        this.creationTime = group.getCreationDate();
        this.isSuspended = group.isSuspended();
        this.suspendedReason = group.getSuspendedReason();
    }
    public GroupDTO() {}
}
