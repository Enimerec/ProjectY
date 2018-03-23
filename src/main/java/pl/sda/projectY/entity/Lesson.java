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
    private Integer instructor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
    private Integer student;

    private LocalDate date;
    private Integer from;
    private Integer to;
    
}
