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
@Table(name = "Instructor")

public class Instructor extends User{

    @Column(name = "User_ID")
    @OneToOne
    private Integer userId;

    private String name;
    private String surname;
    private String telephone;

    @Column(name = "e-mail")
    private String eMail;

    private String pesel;

    @Id
    @Column(name = "Instructor")
    @OneToMany
    private String instNumber;

}
