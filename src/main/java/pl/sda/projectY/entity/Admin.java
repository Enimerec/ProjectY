package pl.sda.projectY.entity;

import lombok.*;
import org.omg.CORBA.PRIVATE_MEMBER;

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
@Table(name = "Admin")
public class Admin extends User {

    @Column(name = "USER_ID")
    @OneToOne
    private Integer userID;

    private String name;
    private String surname;
    private String telephone;

    @Column(name = "e-mail")
    private String eMail;

}
