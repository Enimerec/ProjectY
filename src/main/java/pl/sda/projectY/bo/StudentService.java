package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.projectY.dto.StudentDto;
import pl.sda.projectY.entity.Student;
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

    @Autowired
    public StudentService(PasswordEncoder passwordEncoder, StudentRepository studentRepository) {
        this.passwordEncoder = passwordEncoder;
        this.studentRepository = studentRepository;
    }

    public void addNewStudent(StudentDto studentDto) {
        Student newStudent = getStudent(studentDto);
        studentRepository.save(newStudent);
    }

    private Student getStudent(StudentDto studentDto) {
        Student newStudent = new Student();

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

        newStudent.setMainInstructor(studentDto.getMainInstructor());
        newStudent.setStartDate(studentDto.getStartDate());
        return newStudent;
    }

    public void deleteStudentById(int userId) {
        studentRepository.delete(userId);
    }
}
