package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.projectY.dto.InstructorDto;
import pl.sda.projectY.entity.Instructor;
import pl.sda.projectY.repository.InstructorRepository;
import pl.sda.projectY.type.Role;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Service

public class InstructorService {

    private final PasswordEncoder passwordEncoder;
    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorService(PasswordEncoder passwordEncoder, InstructorRepository instructorRepository) {
        this.passwordEncoder = passwordEncoder;
        this.instructorRepository = instructorRepository;
    }

    public void addNewInst(InstructorDto instructorDto) {
        Instructor newInstructor = getInstructor(instructorDto);

        instructorRepository.save(newInstructor);
    }

    private Instructor getInstructor(InstructorDto instructorDto) {
        Instructor newInstructor = new Instructor();

        newInstructor.setUserId(instructorDto.getUserId());
        newInstructor.setLogin(instructorDto.getLogin());
        newInstructor.setPassword(passwordEncoder.encode(instructorDto.getPassword()));
        newInstructor.setRole(Role.INSTRUCTOR);
        newInstructor.setCity(instructorDto.getCity());
        newInstructor.setEMail(instructorDto.getEMail());
        newInstructor.setInstNumber(instructorDto.getInstNumber());
        newInstructor.setName(instructorDto.getName());
        newInstructor.setPesel(instructorDto.getPesel());
        newInstructor.setPostCode(instructorDto.getPostCode());
        newInstructor.setStreet(instructorDto.getStreet());
        newInstructor.setSurname(instructorDto.getSurname());
        newInstructor.setTelephone(instructorDto.getTelephone());
        return newInstructor;
    }

    public void deleteInstructorByid(int userId) {
        instructorRepository.delete(userId);
    }
}
