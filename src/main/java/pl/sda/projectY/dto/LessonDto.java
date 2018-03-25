package pl.sda.projectY.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import pl.sda.projectY.entity.Instructor;
import pl.sda.projectY.entity.Student;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonDto {

    private Integer lessonId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private Integer startHour;
    private Integer finishHour;

    private Instructor instructor;
    private Student student;

}
