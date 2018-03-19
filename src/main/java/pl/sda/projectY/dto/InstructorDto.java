package pl.sda.projectY.dto;

import lombok.*;
import pl.sda.projectY.entity.Lesson;
import pl.sda.projectY.entity.Student;

import java.util.List;
import java.util.Set;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InstructorDto extends UserDto{

    private String name;
    private String surname;
    private String telephone;
    private String eMail;
    private String pesel;
    private String instNumber;
    private String street;
    private String postCode;
    private String city;

    private Set<Lesson> lessonList;
    private Set<Student> studentList;
}
