package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.projectY.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
}
