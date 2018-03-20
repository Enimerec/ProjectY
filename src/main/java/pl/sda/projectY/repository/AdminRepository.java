package pl.sda.projectY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.entity.Admin;

import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Repository
@Transactional
public interface AdminRepository extends JpaRepository<Admin,Integer> {

    //Admin findAdminByUserID(Integer id);
    //Admin findAdminByEMail(String email);

    List<Admin> findAll();

}
