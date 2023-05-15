package com.inposterProject.inposter.model.dto;

import com.inposterProject.inposter.model.entity.Image;

import javax.validation.constraints.NotNull;

public class ImageDTO {
    @NotNull
    private String path;

    public ImageDTO (Image image) {
        this.path = image.getPath();
    }

    public ImageDTO() {}
}
