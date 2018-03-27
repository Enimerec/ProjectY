package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.projectY.dto.StudentDto;
import pl.sda.projectY.entity.Student;
import pl.sda.projectY.repository.InstructorRepository;
import pl.sda.projectY.repository.StudentRepository;
import pl.sda.projectY.type.Role;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Service
public class StudentService {
    private final PasswordEncoder passwordEncoder;
    private final StudentRepository studentRepository;
    private final InstructorRepository instructorRepository;

    @Autowired
    public StudentService(PasswordEncoder passwordEncoder, StudentRepository studentRepository, InstructorRepository instructorRepository) {
        this.passwordEncoder = passwordEncoder;
        this.studentRepository = studentRepository;
        this.instructorRepository = instructorRepository;
    }

    public void addNewStudent(StudentDto studentDto) {
        Student newStudent = getStudent(studentDto);
        studentRepository.save(newStudent);
    }

    private Student getStudent(StudentDto studentDto) {
        Student newStudent = new Student();

        newStudent.setUserId(studentDto.getUserId());
        newStudent.setLogin(studentDto.getLogin());
        newStudent.setPassword(passwordEncoder.encode(studentDto.getPassword()));
        newStudent.setRole(Role.STUDENT);

        newStudent.setName(studentDto.getName());
        newStudent.setSurname(studentDto.getSurname());
        newStudent.setTelephone(studentDto.getTelephone());

        newStudent.setCity(studentDto.getCity());
        newStudent.setStreet(studentDto.getStreet());
        newStudent.setPostCode(studentDto.getPostCode());

        newStudent.setIdNumber(studentDto.getIdNumber());
        newStudent.setPesel(studentDto.getPesel());
        newStudent.setPkNum(studentDto.getPkNum());
        newStudent.setRegNum(studentDto.getRegNum());

        if(studentDto.getMainInstructor()!=null) {
            newStudent.setMainInstructor(instructorRepository.findOne(studentDto.getMainInstructor()));
        }
       newStudent.setStartDate(studentDto.getStartDate());
        return newStudent;
    }

    public void deleteStudentById(int userId) {
        studentRepository.delete(userId);
    }
}
