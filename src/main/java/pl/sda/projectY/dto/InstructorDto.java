package pl.sda.projectY.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * author:
 * Mateusz
 * Marczak
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InstructorDto {
    private int userId;
    private String name;
    private String surname;
    private String telephone;
    private String eMail;
    private String pesel;
    private String address;
    private String ID;
}
