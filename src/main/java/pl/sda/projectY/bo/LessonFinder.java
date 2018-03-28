package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.dto.LessonDto;
import pl.sda.projectY.entity.Lesson;
import pl.sda.projectY.repository.LessonRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Service
@Transactional(readOnly = true)
public class LessonFinder {
    private LessonRepository lessonRepository;
    private StudentFinder studentFinder;
    private InstructorFinder instructorFinder;

    @Autowired
    public LessonFinder(LessonRepository lessonRepository, StudentFinder studentFinder, InstructorFinder instructorFinder) {
        this.lessonRepository = lessonRepository;
        this.studentFinder = studentFinder;
        this.instructorFinder = instructorFinder;
    }

    public List<LessonDto> findAll() {
        List<LessonDto> lessonDto = new ArrayList<>();
        lessonRepository.findAll().forEach(lesson -> lessonDto.add(getLessonDto(lesson)));
        return lessonDto;
    }

    private LessonDto getLessonDto(Lesson lesson) {
        LessonDto lessonDto = new LessonDto();
        lessonDto.setLessonId(lesson.getLessonId());
        lessonDto.setDate(lesson.getDate());
        lessonDto.setStartHour(lesson.getStartHour());
        lessonDto.setFinishHour(lesson.getFinishHour());
        if(lesson.getInstructor()!=null) {
            lessonDto.setInstructor(instructorFinder.getInstructorShortDto(lesson.getInstructor()));
        }
        if(lesson.getStudent()!=null) {
            lessonDto.setStudent(studentFinder.getStudentShortDto(lesson.getStudent()));
        }

        return lessonDto;



    }

    public LessonDto findById(int lessonId) {
        return getLessonDto(lessonRepository.findOne(lessonId));
    }

    public List<LessonDto> findAllByStudent_userIdOrderByDate(int student){
        List<LessonDto> lessonDto = new ArrayList<>();
        lessonRepository.findAllByStudent_UserIdOrderByDate(student).forEach(lesson -> lessonDto.add(getLessonDto(lesson)));
        return lessonDto;
    }

    public List<LessonDto> findAllByInstructor_userIdOrderByDate(int instructor) {
        List<LessonDto> lessonDto = new ArrayList<>();
        lessonRepository.findAllByInstructor_UserIdOrderByDate(instructor).forEach(lesson -> lessonDto.add(getLessonDto(lesson)));
        return lessonDto;
    }
}
