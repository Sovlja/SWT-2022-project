package rs.ac.uns.ftn.svtvezbe07.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "postsTable")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, name = "postId")
    private Long id;

    @Column(nullable = false, name = "content")
    private String content;

    @Column(nullable = false, name = "creationDate")
    private LocalDateTime creationDate;

}
