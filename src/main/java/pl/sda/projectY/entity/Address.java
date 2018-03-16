package pl.sda.projectY.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Entity
public class Address extends User {

    @OneToOne
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "street_address")
    private String street;

    @Column(name = "postal_code")
    private String postCode;

    @Column(name = "city")
    private String city;
}
