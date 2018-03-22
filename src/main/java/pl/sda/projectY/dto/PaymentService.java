package pl.sda.projectY.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.projectY.entity.Payment;
import pl.sda.projectY.repository.PaymentRepository;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public void addNewPayment(PaymentDto paymentDto) {
        Payment payment  = new Payment();
        payment.setAmount(paymentDto.getAmount());
        payment.setDate(paymentDto.getDate());
        payment.setPaymentId(paymentDto.getPaymentId());
        payment.setStudent(paymentDto.getStudent());
        payment.setType(paymentDto.getType());

        paymentRepository.save(payment);
    }

    public void deletePaymentById(int paymentId) {
        paymentRepository.delete(paymentId);
    }


}
