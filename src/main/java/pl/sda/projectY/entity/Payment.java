package pl.sda.projectY.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

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
@Table(name = "Payment")
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
