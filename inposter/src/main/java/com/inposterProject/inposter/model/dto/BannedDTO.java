package com.inposterProject.inposter.model.dto;

import com.inposterProject.inposter.model.entity.Banned;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class BannedDTO {
    private Long id;

    @NotNull
    private LocalDate timestamp;

    public BannedDTO (Banned banned) {
        this.id = banned.getId();
        this.timestamp = banned.getTimestamp();
    }

    public BannedDTO () {}
}
