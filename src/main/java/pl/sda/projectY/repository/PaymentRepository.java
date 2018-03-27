package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.entity.Payment;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public interface PaymentRepository extends JpaRepository<Payment,Integer> {

    List<Payment> findAll();

    Payment findByPaymentId(int id);

    List<Payment> findAllByStudent_userIdOrderByDate(int student);
}
