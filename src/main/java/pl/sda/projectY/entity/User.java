package pl.sda.projectY.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Getter
@Setter
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    @OneToOne
    private Integer id;

    private String login;
    private String password;

    @Column(name = "ROLE_ID")
    private String roleId;

}
