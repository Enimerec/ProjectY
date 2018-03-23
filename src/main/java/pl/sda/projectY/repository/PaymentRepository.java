package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.projectY.entity.Payment;
import pl.sda.projectY.entity.Student;

import java.sql.Date;
import java.util.List;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

    List<Payment> findAllOrderByDate(LocalDate date);

    Payment findByPaymentId(int id);

    List<Payment>findAllByStudent_idOrderByDate(int student);
}
