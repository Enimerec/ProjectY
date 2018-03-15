package pl.sda.projectY.entity;

import lombok.Getter;
import lombok.Setter;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Table;

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
    private int userID;

    private String name;
    private String surname;
    private String telephone;

    @Column(name = "e-mail")
    private String eMail;

}
