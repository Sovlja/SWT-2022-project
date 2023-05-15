package com.inposterProject.inposter.model.dto;

import com.inposterProject.inposter.model.entity.Reaction;
import com.inposterProject.inposter.model.entity.ReactionType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ReactionDTO {

    private Long id;
    @NotNull
    private ReactionType type;

    @NotNull
    private LocalDate timestamp;

    public ReactionDTO (Reaction reaction) {
        this.id = reaction.getId();
        this.type = reaction.getType();
        this.timestamp = reaction.getTimestamp();
    }
    public ReactionDTO () {}
}
