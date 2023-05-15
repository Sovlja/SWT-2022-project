package com.inposterProject.inposter.model.dto;

import com.inposterProject.inposter.model.entity.Comment;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class CommentDTO {

    private Long id;

    @NotBlank
    private String text;
    @NotNull
    private LocalDate timestamp;

    @NotBlank
    private boolean isDeleted;

    public CommentDTO (Comment comment) {
        this.id = comment.getId();
        this.text = comment.getText();
        this.timestamp = comment.getTimeStamp();
        this.isDeleted = comment.isDeleted();
    }

    public CommentDTO(){}

}
