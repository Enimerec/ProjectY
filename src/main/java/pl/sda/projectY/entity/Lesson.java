package pl.sda.projectY.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Lesson")
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
