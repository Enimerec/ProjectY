package pl.sda.projectY.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import pl.sda.projectY.type.PaymentType;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentShortDto {

    private Integer paymentId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private BigDecimal amount;
    private PaymentType type;

    private StudentDto student;
}
