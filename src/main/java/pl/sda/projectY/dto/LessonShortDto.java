package pl.sda.projectY.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

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
public class LessonShortDto {

    private Integer lessonId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private Integer startHour;
    private Integer finishHour;
    private InstructorDto instructor;
    private StudentDto student;
}
