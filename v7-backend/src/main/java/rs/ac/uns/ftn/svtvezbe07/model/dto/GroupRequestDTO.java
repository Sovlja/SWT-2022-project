package rs.ac.uns.ftn.svtvezbe07.model.dto;

import rs.ac.uns.ftn.svtvezbe07.model.entity.GroupRequest;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class GroupRequestDTO {

    private Long id;
    @NotNull
    private boolean approved;
    private LocalDateTime createdAt;
    private LocalDateTime at;

    public GroupRequestDTO (GroupRequest groupRequest) {
        this.id = groupRequest.getId();
        this.approved = groupRequest.isApproved();
        this.createdAt = groupRequest.getCreatedAt();
        this.at = groupRequest.getAt();
    }

    public GroupRequestDTO() {}
}
