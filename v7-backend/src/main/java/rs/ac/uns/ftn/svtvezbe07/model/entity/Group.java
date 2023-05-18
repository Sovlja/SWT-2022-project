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
@Table(name = "groupsTable")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupId", unique = true, nullable = false)
    private Long id;

    @Column(name = "groupName", unique = true, nullable = false)
    private String name;

    @Column(name = "groupDescription", nullable = false)
    private String description;

    @Column (name = "creationDate", nullable = false)
    private LocalDateTime creationDate;

    @Column (name = "suspended", nullable = false)
    private boolean isSuspended;

    @Column(name = "suspendedReason")
    private String suspendedReason;

}
