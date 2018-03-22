package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.projectY.entity.Payment;

import java.sql.Date;
import java.util.Set;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

    Set<Payment> findAllOrderByDate(Date date);

    Payment findByPaymentId(int id);
}
