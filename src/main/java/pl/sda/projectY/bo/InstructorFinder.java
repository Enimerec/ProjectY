package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
@Transactional(readOnly = true)
public class InstructorFinder {

    private InstructorRepository instructorRepository;

    @Autowired
    public InstructorFinder(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }


    public List<InstructorDto> findAll() {
        List<InstructorDto>instructorDto = new ArrayList<>();
        instructorRepository.findAll().forEach(instructor ->
                instructorDto.add(getInstructorDto(instructor)));
        return instructorDto;
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
        //instructorDto.setPassword(mainInstructor.getPassword());
        instructorDto.setCity(instructor.getCity());
        instructorDto.setEMail(instructor.getEMail());
        instructorDto.setInstNumber(instructor.getInstNumber());
        instructorDto.setPesel(instructor.getPesel());
        instructorDto.setPostCode(instructor.getPostCode());
        instructorDto.setStreet(instructor.getStreet());

        /*List<Student> studentList = new ArrayList<>(mainInstructor.getStudentList());
        List<Lesson> lessonsList = new ArrayList<>(mainInstructor.getLessonList());

        instructorDto.setLessonList(lessonsList);
        instructorDto.setStudentList(studentList);*/

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
