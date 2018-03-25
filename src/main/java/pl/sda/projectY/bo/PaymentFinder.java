package pl.sda.projectY.bo;

import org.springframework.stereotype.Service;
import pl.sda.projectY.dto.PaymentDto;
import pl.sda.projectY.entity.Payment;
import pl.sda.projectY.repository.PaymentRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
// set zamiast list
    public Set<PaymentDto> findAllByUserIdOrderByDate(int student){
        Set<PaymentDto> paymentDto = new HashSet<>();
        paymentRepository.findAllByStudent_userIdOrderByDate(student).forEach(payment -> paymentDto.add(getPaymentDto(payment)));
        return paymentDto;
    }

}
