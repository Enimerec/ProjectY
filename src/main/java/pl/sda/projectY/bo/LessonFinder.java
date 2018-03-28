package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.dto.LessonDto;
import pl.sda.projectY.dto.LessonShortDto;
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
    private InstructorFinder instructorFinder;
    private StudentFinder studentFinder;

    @Autowired
    public LessonFinder(LessonRepository lessonRepository, InstructorFinder instructorFinder, StudentFinder studentFinder) {
        this.lessonRepository = lessonRepository;
        this.instructorFinder = instructorFinder;
        this.studentFinder = studentFinder;
    }

    /*public List<LessonDto> findAll() {
        List<LessonDto> lessonDto = new ArrayList<>();
        lessonRepository.findAll().forEach(lesson -> lessonDto.add(getLessonDto(lesson)));
        return lessonDto;
    }*/

    private LessonDto getLessonDto(Lesson lesson) {
        LessonDto lessonDto = new LessonDto();
        lessonDto.setLessonId(lesson.getLessonId());
        lessonDto.setDate(lesson.getDate());
        lessonDto.setStartHour(lesson.getStartHour());
        lessonDto.setFinishHour(lesson.getFinishHour());
        if(lesson.getInstructor()!=null) {
            lessonDto.setInstructor(lesson.getInstructor().getUserId());
        }
        if(lesson.getStudent()!=null) {
            lessonDto.setStudent(lesson.getStudent().getUserId());
        }

        return lessonDto;

    }

    public LessonDto findById(int lessonId) {
        return getLessonDto(lessonRepository.findOne(lessonId));
    }

    /*public List<LessonDto> findAllByStudent_userIdOrderByDate(int student){
        List<LessonDto> lessonDto = new ArrayList<>();
        lessonRepository.findAllByStudent_UserIdOrderByDate(student).forEach(lesson -> lessonDto.add(getLessonDto(lesson)));
        return lessonDto;
    }*/

    public List<LessonDto> findAllByInstructor_userIdOrderByDate(int instructor) {
        List<LessonDto> lessonDto = new ArrayList<>();
        lessonRepository.findAllByInstructor_UserIdOrderByDate(instructor).forEach(lesson -> lessonDto.add(getLessonDto(lesson)));
        return lessonDto;
    }

    public List<LessonShortDto> findAllShort() {
        List<LessonShortDto> lessonDto = new ArrayList<>();
        lessonRepository.findAll().forEach(lesson -> lessonDto.add(getLessonShortDto(lesson)));
        return lessonDto;

    }

    private LessonShortDto getLessonShortDto(Lesson lesson) {
        LessonShortDto lessonShortDto = new LessonShortDto();
        lessonShortDto.setStartHour(lesson.getStartHour());
        lessonShortDto.setFinishHour(lesson.getFinishHour());
        lessonShortDto.setLessonId(lesson.getLessonId());
        lessonShortDto.setDate(lesson.getDate());
        lessonShortDto.setInstructor(instructorFinder.findById(lesson.getInstructor().getUserId()));
        lessonShortDto.setStudent(studentFinder.findById(lesson.getStudent().getUserId()));
        return lessonShortDto;
    }

    public List<LessonShortDto> findAllByStudent_userIdOrderByDateShort(int userId) {
        List<LessonShortDto> lessonDto = new ArrayList<>();
        lessonRepository.findAllByStudent_UserIdOrderByDate(userId).forEach(lesson ->
                lessonDto.add(getLessonShortDto(lesson)));
        return lessonDto;
    }
}
