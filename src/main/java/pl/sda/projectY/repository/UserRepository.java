package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.entity.User;

import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Integer> {

    User findUserByLogin(String login);

    User findUserByById(Integer id);

    User findUserByByRoleID(String roleId);

    @Query("SELECT User.roleId FROM User WHERE User.id = ?1")
    String findRoleIdById(Integer id);

    List<User> findAll();
}
