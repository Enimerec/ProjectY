package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.entity.Lesson;

@Repository
@Transactional
public interface LessonRepository extends JpaRepository<Lesson,Integer> {
}
