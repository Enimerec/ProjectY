package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.projectY.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson,Integer> {
}
