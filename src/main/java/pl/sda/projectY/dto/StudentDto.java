package pl.sda.projectY.dto;

import lombok.*;
import java.sql.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto extends UserDto{

    private String name;
    private String surname;
    private String telephone;
    private String pesel;
    private String regNum;
    private String pkNum;
    private String idNumber;
    private Date startDate;
    private Date endDate;
    private String street;
    private String postCode;
    private String city;
}
