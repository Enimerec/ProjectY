package pl.sda.projectY.dto;

import lombok.*;
import pl.sda.projectY.entity.Instructor;
import pl.sda.projectY.entity.Lesson;
import pl.sda.projectY.entity.Payment;

import java.sql.Date;
import java.util.List;
import java.util.Set;

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
    private String street;
    private String postCode;
    private String city;
    private Date startDate;
    private Date endDate;

    private Instructor mainInstructor;
    private Set<Payment> paymentList;
    private Set<Lesson> lessonList;
}
