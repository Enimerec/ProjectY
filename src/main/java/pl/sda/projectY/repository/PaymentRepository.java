package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.projectY.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
