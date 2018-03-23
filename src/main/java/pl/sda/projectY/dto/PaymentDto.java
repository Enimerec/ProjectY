package pl.sda.projectY.dto;

import lombok.*;
import pl.sda.projectY.entity.Student;
import pl.sda.projectY.type.PaymentType;

import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

    private Integer paymentId;
    private Date date;
    private BigDecimal amount;
    private PaymentType type;
    private StudentDto student;
}
