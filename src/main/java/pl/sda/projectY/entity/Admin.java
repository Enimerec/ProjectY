package pl.sda.projectY.entity;

import lombok.Getter;
import lombok.Setter;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.*;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Getter
@Entity
@Setter
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
