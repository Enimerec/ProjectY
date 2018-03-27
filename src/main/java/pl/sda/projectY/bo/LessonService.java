package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.projectY.dto.LessonDto;
import pl.sda.projectY.entity.Lesson;
import pl.sda.projectY.repository.InstructorRepository;
import pl.sda.projectY.repository.LessonRepository;
import pl.sda.projectY.repository.StudentRepository;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Service
public class LessonService {


    private LessonRepository lessonRepository;
    private InstructorRepository instructorRepository;
    private StudentRepository studentRepository;

    @Autowired
    public LessonService(LessonRepository lessonRepository, InstructorRepository instructorRepository, StudentRepository studentRepository) {
        this.lessonRepository = lessonRepository;
        this.instructorRepository = instructorRepository;
        this.studentRepository = studentRepository;
    }

    public void add(LessonDto newLesson) {
        lessonRepository.save(getLesson(newLesson));

    }

    private Lesson getLesson(LessonDto newLesson) {
        Lesson lesson = new Lesson();
        lesson.setLessonId(newLesson.getLessonId());
        lesson.setDate(newLesson.getDate());
        lesson.setStartHour(newLesson.getStartHour());
        lesson.setFinishHour(newLesson.getFinishHour());
        if(newLesson.getInstructor()!=null) {
            lesson.setInstructor(instructorRepository.getOne(newLesson.getInstructor()));
        }
        if(newLesson.getStudent()!=null) {
            lesson.setStudent(studentRepository.getOne(newLesson.getStudent()));
        }
        return lesson;
    }


    public void deleteById(int lessonId) {
        lessonRepository.delete(lessonId);
    }
}
