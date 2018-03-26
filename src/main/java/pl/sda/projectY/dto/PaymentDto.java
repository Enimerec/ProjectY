package pl.sda.projectY.dto;

import lombok.*;
import pl.sda.projectY.entity.Student;
import pl.sda.projectY.type.PaymentType;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

    private Integer paymentId;
    private LocalDate date;
    private BigDecimal amount;
    private PaymentType type;

    private Integer student;

}
