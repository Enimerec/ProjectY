package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
public class LessonFinder {
    private LessonRepository lessonRepository;

    @Autowired
    public LessonFinder(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public List<LessonDto> findAll() {
        List<LessonDto> lessonDto = new ArrayList<>();
        lessonRepository.findAll().forEach(lesson -> lessonDto.add(getLessonDto(lesson)));
        return lessonDto;
    }

    private LessonDto getLessonDto(Lesson newLesson) {
        LessonDto lesson = new LessonDto();
        lesson.setDate(newLesson.getDate());
        lesson.setStartHour(newLesson.getStartHour());
        lesson.setFinishHour(newLesson.getFinishHour());
        if(newLesson.getInstructor()!=null) {
            lesson.setInstructor(newLesson.getInstructor().getUserId());
        }
        if(newLesson.getStudent()!=null) {
            lesson.setStudent(newLesson.getStudent().getUserId());
        }

        return lesson;



    }

    public LessonDto findById(int lessonId) {
        return getLessonDto(lessonRepository.findOne(lessonId));
    }
}
