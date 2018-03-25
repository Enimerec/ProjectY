package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.projectY.entity.Payment;


import java.time.LocalDate;

import java.util.List;


public interface PaymentRepository extends JpaRepository<Payment,Integer> {

    List<Payment> findAllOrderByDate(LocalDate date);

    Payment findByPaymentId(int id);

    List<Payment> findAllByStudent_userIdOrderByDate(int student);
}
