package pl.sda.projectY.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Table(name = "Address")
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
