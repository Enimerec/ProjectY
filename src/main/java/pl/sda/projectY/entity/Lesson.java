package pl.sda.projectY.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * author:
 * Mateusz
 * Marczak
 **/

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

    private Date date;
    private Integer from;
    private Integer to;
    
}
