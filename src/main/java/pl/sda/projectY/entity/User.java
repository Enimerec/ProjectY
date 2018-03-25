package pl.sda.projectY.entity;

import lombok.Data;
import pl.sda.projectY.type.Role;

import javax.persistence.*;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID", unique = true)
    private Integer userId;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_user")
    private Role role;
}
