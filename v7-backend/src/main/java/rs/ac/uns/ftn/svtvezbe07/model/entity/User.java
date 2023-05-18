package rs.ac.uns.ftn.svtvezbe07.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "usersTable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "userId")
    private Long id;

    @Column(nullable = false, unique = true, name = "email")
    private String email;

    @Column(nullable = false, unique = true, name = "username")
    private String username;

    @Column(nullable = false, name = "userPassword")
    private String password;

    @Column(nullable = false, name = "lastLogin")
    private LocalDateTime LastLogin;

    @Column(nullable = false, name = "firstname")
    private String firstname;
    @Column(nullable = false, name = "lastname")
    private String lastname;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Roles role;

    @OneToMany( fetch = FetchType.EAGER)
    private Set<Post> posts = new HashSet<Post>();
}

