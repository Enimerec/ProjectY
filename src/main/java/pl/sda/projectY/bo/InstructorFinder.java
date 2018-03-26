package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import pl.sda.projectY.dto.InstructorDto;
import pl.sda.projectY.dto.StudentDto;
import pl.sda.projectY.entity.Instructor;
import pl.sda.projectY.entity.Lesson;
import pl.sda.projectY.entity.Student;
import pl.sda.projectY.repository.InstructorRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

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

    public InstructorDto findById(int userId) {
        Instructor instructor = instructorRepository.findOne(userId);
        return getInstructorDto(instructor);

    }

    private InstructorDto getInstructorDto(Instructor instructor) {
        InstructorDto instructorDto = new InstructorDto();
        instructorDto.setUserId(instructor.getUserId());
        instructorDto.setName(instructor.getName());
        instructorDto.setSurname(instructor.getSurname());
        instructorDto.setLogin(instructor.getLogin());
        instructorDto.setPassword(instructor.getPassword());
        instructorDto.setCity(instructor.getCity());
        instructorDto.setEMail(instructor.getEMail());
        instructorDto.setInstNumber(instructor.getInstNumber());
        instructorDto.setPesel(instructor.getPesel());
        instructorDto.setPostCode(instructor.getPostCode());
        instructorDto.setStreet(instructor.getStreet());

        List<Student> studentList = new ArrayList<>(instructor.getStudentList());
        List<Lesson> lessonsList = new ArrayList<>(instructor.getLessonList());

        instructorDto.setLessonList(lessonsList);
        instructorDto.setStudentList(studentList);

        return instructorDto;
    }

    public InstructorDto getUserDetails() {
        Optional<UserDetails> userDetails =
                Optional.ofNullable(SecurityContextHolder.getContext())
                        .map(SecurityContext::getAuthentication)
                        .map(Authentication::getPrincipal)
                        .map(ud -> (UserDetails) ud);

        String login = userDetails.get().getUsername();
        return findByLogin(login);
    }

    private InstructorDto findByLogin(String login) {
        Instructor instructor = instructorRepository.findByLogin(login);
        return getInstructorDto(instructor);
    }
}
