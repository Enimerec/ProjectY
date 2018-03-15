package pl.sda.projectY.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Getter
@Setter
@Entity
@Table(name = "Instructor")

public class Instructor {

    @Column(name = "User_ID")
    private int userId;

    private String name;
    private String surname;
    private String telephone;

    @Column(name = "e-mail")
    private String eMail;

    private String pesel;
    private String address;
    private String ID;
}
