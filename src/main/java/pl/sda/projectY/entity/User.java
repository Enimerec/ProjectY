package pl.sda.projectY.entity;

import lombok.*;

import javax.persistence.*;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
