package pl.sda.projectY.entity;

import lombok.Data;
import pl.sda.projectY.type.PaymentType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue
    @Column(name = "PAYMENT_ID")
    private Integer paymentId;

    private Date date;

    @Column(name = "amount")
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_type")
    private PaymentType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

}
