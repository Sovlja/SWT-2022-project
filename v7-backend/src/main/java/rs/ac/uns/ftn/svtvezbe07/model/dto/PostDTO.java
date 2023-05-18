package rs.ac.uns.ftn.svtvezbe07.model.dto;

import rs.ac.uns.ftn.svtvezbe07.model.entity.Post;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class PostDTO {

    private Long id;

    @NotBlank
    private String content;

    @NotBlank
    private LocalDateTime creationDate;

    public PostDTO (Post post){
        this.id = post.getId();
        this.content = post.getContent();
        this.creationDate = post.getCreationDate();
    }

    public PostDTO(){}
}
