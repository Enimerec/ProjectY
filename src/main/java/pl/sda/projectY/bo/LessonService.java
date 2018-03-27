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
        Lesson lesson = getLesson(newLesson);
        lessonRepository.save(lesson);

    }

    private Lesson getLesson(LessonDto lessonDto) {
        Lesson lesson = new Lesson();
        lesson.setLessonId(lessonDto.getLessonId());
        lesson.setDate(lessonDto.getDate());
        lesson.setStartHour(lessonDto.getStartHour());
        lesson.setFinishHour(lessonDto.getFinishHour());
        if(lessonDto.getInstructor()!=null) {
            lesson.setInstructor(instructorRepository.getOne(lessonDto.getInstructor()));
        }
        if(lessonDto.getStudent()!=null) {
            lesson.setStudent(studentRepository.getOne(lessonDto.getStudent()));
        }
        return lesson;
    }


    public void deleteById(int lessonId) {
        lessonRepository.delete(lessonId);
    }

    public void editLesson(LessonDto lessonDto) {
        Lesson lesson = lessonRepository.findOne(lessonDto.getLessonId());
        lesson.setDate(lessonDto.getDate());
        lesson.setStartHour(lessonDto.getStartHour());
        lesson.setFinishHour(lessonDto.getFinishHour());
        if(lessonDto.getInstructor()!=null) {
            lesson.setInstructor(instructorRepository.getOne(lessonDto.getInstructor()));
        }
        if(lessonDto.getStudent()!=null) {
            lesson.setStudent(studentRepository.getOne(lessonDto.getStudent()));
        }
        lessonRepository.save(lesson);

    }
}
