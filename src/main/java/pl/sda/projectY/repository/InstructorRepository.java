package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.entity.Instructor;

import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Repository
@Transactional
public interface InstructorRepository extends JpaRepository<Instructor,Integer>{

    //Instructor findInstructorByUserId(Integer id);

    List<Instructor> findAll();

    Instructor findByLogin(String login);
}
