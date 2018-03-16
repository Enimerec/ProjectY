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
