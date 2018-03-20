package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.projectY.entity.Instructor;
import pl.sda.projectY.repository.InstructorRepository;

import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Service
public class InstructorFinder {

     private InstructorRepository instructorRepository;

    @Autowired
    public InstructorFinder(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }


    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }
}
