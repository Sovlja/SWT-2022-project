package rs.ac.uns.ftn.svtvezbe07.model.dto;

import rs.ac.uns.ftn.svtvezbe07.model.entity.Reaction;
import rs.ac.uns.ftn.svtvezbe07.model.entity.ReactionType;

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
