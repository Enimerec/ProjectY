package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.entity.Lesson;

import java.util.List;

@Repository
@Transactional
public interface LessonRepository extends JpaRepository<Lesson,Integer> {

    List<Lesson> findAllByStudent_UserIdOrderByDate(Integer student_userId);
    List<Lesson> findAllByInstructor_UserIdOrderByDate(Integer instruktor_userId);
}
