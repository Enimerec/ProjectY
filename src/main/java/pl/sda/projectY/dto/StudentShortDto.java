package pl.sda.projectY.dto;

import lombok.*;

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
public class StudentShortDto {

    private Integer userId;
    private String fullName;
    private InstructorDto mainInstructor;
    private String regNum;
}
