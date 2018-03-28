package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.dto.PaymentDto;
import pl.sda.projectY.dto.PaymentShortDto;
import pl.sda.projectY.entity.Payment;
import pl.sda.projectY.repository.PaymentRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Service
@Transactional(readOnly = true)
public class PaymentFinder {
    private final PaymentRepository paymentRepository;
    private final StudentFinder studentFinder;

    @Autowired
    public PaymentFinder(PaymentRepository paymentRepository, StudentFinder studentFinder) {
        this.paymentRepository = paymentRepository;
        this.studentFinder = studentFinder;
    }

    public List<PaymentShortDto> findAllOrderByDate(){
        List<PaymentShortDto> paymentDto = new ArrayList<>();
        //Date data = Date.valueOf(LocalDate.now());
        paymentRepository.findAllByOrderByDateDesc().forEach(payment ->
                paymentDto.add(getPaymentShortDto(payment)));
        return paymentDto;
    }

    private PaymentShortDto getPaymentShortDto(Payment payment) {
        PaymentShortDto paymentShortDto = new PaymentShortDto();
        paymentShortDto.setPaymentId(payment.getPaymentId());
        paymentShortDto.setAmount(payment.getAmount());
        paymentShortDto.setDate(payment.getDate());
        paymentShortDto.setAmount(payment.getAmount());
        paymentShortDto.setStudent(studentFinder.findById(payment.getStudent().getUserId()));
        return paymentShortDto;
    }

    private PaymentDto getPaymentDto(Payment payment){
        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setAmount(payment.getAmount());
        paymentDto.setDate(payment.getDate());
        paymentDto.setPaymentId(payment.getPaymentId());
        if(payment.getStudent()!=null) {
            paymentDto.setStudent(studentFinder.getStudentShortDto(payment.getStudent()));
        }
        paymentDto.setType(payment.getType());

        return paymentDto;
    }

    public PaymentDto findById(int paymentId) {
        return getPaymentDto(paymentRepository.findByPaymentId(paymentId));
    }

    public List<PaymentDto> findAllByStudent_userIdOrderByDate(int student){
        List<PaymentDto> paymentDto = new ArrayList<>();
        paymentRepository.findAllByStudent_UserIdOrderByDate(student).forEach(payment -> paymentDto.add(getPaymentDto(payment)));
        return paymentDto;
    }

}
