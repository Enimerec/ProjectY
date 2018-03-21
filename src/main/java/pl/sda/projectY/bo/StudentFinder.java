package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.projectY.dto.StudentDto;
import pl.sda.projectY.entity.Student;
import pl.sda.projectY.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<StudentDto> findAll() {
        List<Student>studentList = studentRepository.findAll();
        List<StudentDto> studentDtoList = new ArrayList<>();
        studentList.forEach(student -> studentDtoList.add(getStudentDto(student)));
        return studentDtoList;
    }

    public StudentDto findById(int id) {
        Student student =  studentRepository.findOne(id);
        return getStudentDto(student);

    }

    private StudentDto getStudentDto(Student student) {
        StudentDto newStudent = new StudentDto();

        newStudent.setUserId(student.getUserId());
        newStudent.setLogin(student.getLogin());
        newStudent.setName(student.getName());
        newStudent.setSurname(student.getSurname());
        newStudent.setTelephone(student.getTelephone());

        newStudent.setCity(student.getCity());
        newStudent.setStreet(student.getStreet());
        newStudent.setPostCode(student.getPostCode());

        newStudent.setIdNumber(student.getIdNumber());
        newStudent.setPesel(student.getPesel());
        newStudent.setPkNum(student.getPkNum());
        newStudent.setRegNum(student.getRegNum());

        newStudent.setMainInstructor(student.getMainInstructor());
        newStudent.setStartDate(student.getStartDate());
        newStudent.setLessonList(student.getLessonList());
        newStudent.setPaymentList(student.getPaymentList());
        return newStudent;
    }

    public StudentDto findByLogin(String login) {
        Student student = studentRepository.findByLogin(login);
        return getStudentDto(student);
    }


    public StudentDto getUserDetails() {
        Optional<UserDetails> userDetails =
                Optional.ofNullable(SecurityContextHolder.getContext())
                        .map(SecurityContext::getAuthentication)
                        .map(Authentication::getPrincipal)
                        .map(ud -> (UserDetails) ud);

        String login = userDetails.get().getUsername();
        return findByLogin(login);
    }
}
