package pl.sda.projectY.entity;

import lombok.Data;

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
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "role_id")
    private String roleId;

}
