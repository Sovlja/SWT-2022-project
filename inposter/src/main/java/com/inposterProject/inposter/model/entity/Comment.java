package com.inposterProject.inposter.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "text")
    private String text;

    @Column(nullable = false, name = "timestamp")
    private LocalDate timestamp;
    @Column(name = "deleted", nullable = false)
    private boolean isDeleted;
}