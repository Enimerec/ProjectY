package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.projectY.entity.Student;
import pl.sda.projectY.repository.StudentRepository;

import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Service
public class StudentFinder {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentFinder(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
