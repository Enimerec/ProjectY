package pl.sda.projectY.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Entity
public class Payment {
    @Id
    @GeneratedValue
    private Integer ID;

    @ManyToOne
    @Column(name = "student_id")
    private String studentId;

    private Date date;

    @Column(name = "amount")
    private BigDecimal amount;
}
