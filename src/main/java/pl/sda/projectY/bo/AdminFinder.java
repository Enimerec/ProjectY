package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.projectY.entity.Admin;
import pl.sda.projectY.repository.AdminRepository;

import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Service
public class AdminFinder {

    private AdminRepository adminRepository;

    @Autowired
    public AdminFinder(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    public List<Admin> findAll() {
        return adminRepository.findAll();
    }
}
