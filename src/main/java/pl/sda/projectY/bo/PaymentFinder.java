package pl.sda.projectY.bo;

import org.springframework.stereotype.Service;
import pl.sda.projectY.dto.PaymentDto;
import pl.sda.projectY.entity.Payment;
import pl.sda.projectY.repository.PaymentRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Service
public class PaymentFinder {
    private final PaymentRepository paymentRepository;

    public PaymentFinder(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<PaymentDto> findAllOrderByDate(){
        List<PaymentDto> paymentDto = new ArrayList<>();
        LocalDate data = LocalDate.now();
        paymentRepository.findAllOrderByDate(data).forEach(payment ->
                paymentDto.add(getPaymentDto(payment)));
        return paymentDto;
    }

    private PaymentDto getPaymentDto(Payment payment){
        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setAmount(payment.getAmount());
        paymentDto.setDate(payment.getDate());
        paymentDto.setPaymentId(payment.getPaymentId());
        paymentDto.setStudent(payment.getStudent());
        paymentDto.setType(payment.getType());

        return paymentDto;
    }

    public PaymentDto findById(int paymentId) {
        return getPaymentDto(paymentRepository.findByPaymentId(paymentId));
    }

    public List<PaymentDto> findAllByUserIdOrderByDate(int student){
        List<PaymentDto>paymentDto = new ArrayList<>();
        paymentRepository.findAllByStudent_idOrderByDate(student).forEach(payment -> paymentDto.add(getPaymentDto(payment)));
        return paymentDto;
    }

}
