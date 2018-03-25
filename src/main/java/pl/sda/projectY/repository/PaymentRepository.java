package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.projectY.entity.Payment;

import java.time.LocalDate;
import java.util.Set;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

    Set<Payment> findAllByStudent_userIdOrderByDate(LocalDate date);

    Payment findByPaymentId(int id);
}
