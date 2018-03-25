package pl.sda.projectY.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Data
@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue
    @Column(name = "LESSON_ID")
    private Integer lessonId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INSTRUCTOR_ID")
    private Instructor instructor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    private LocalDate date;

    @Column(name = "start_hour")
    private Integer startHour;

    @Column(name = "finish_hour")
    private Integer finishHour;

}
