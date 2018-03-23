package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.projectY.entity.Payment;
import pl.sda.projectY.entity.Student;

import java.sql.Date;
import java.util.List;
import java.util.Set;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

    List<Payment> findAllOrderByDate(Date date);

    Payment findByPaymentId(int id);

    List<Payment>findAllByStudentOrderByDate(Student student);
}
