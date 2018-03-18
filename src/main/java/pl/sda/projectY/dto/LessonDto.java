package pl.sda.projectY.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonDto {

    private Integer lessonId;
    private Date date;
    //private LocalTime from;
    //private LocalTime to;
}
