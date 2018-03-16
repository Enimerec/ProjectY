package pl.sda.projectY.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Entity
public class Lesson {

    @ManyToOne
    @Column(name = "INST_ID")
    private String instId;

    @ManyToOne
    @Column(name = "STUD_ID")
    private String studId;

    private Date date;
    private Time from;
    private Time to;

}
