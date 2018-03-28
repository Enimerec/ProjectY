package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.projectY.dto.AdminDto;
import pl.sda.projectY.entity.Admin;
import pl.sda.projectY.repository.AdminRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Service
@Transactional(readOnly = true)
public class AdminFinder {

    private AdminRepository adminRepository;

    @Autowired
    public AdminFinder(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    public List<AdminDto> findAll() {
        List<AdminDto>adminDtoList = new ArrayList<>();
        adminRepository.findAll().forEach(admin -> adminDtoList.add(getAdminDto(admin)));
        return adminDtoList;
    }

    public AdminDto findById(int userId) {
        return getAdminDto(adminRepository.findOne(userId));
    }

    private AdminDto getAdminDto(Admin admin) {
        AdminDto adminDto = new AdminDto();
        adminDto.setLogin(admin.getLogin());
        //adminDto.setPassword(admin.getPassword());
        adminDto.setEMail(admin.getEMail());
        adminDto.setName(admin.getName());
        adminDto.setSurname(admin.getSurname());
        adminDto.setUserId(admin.getUserId());
        adminDto.setTelephone(admin.getTelephone());
        return adminDto;
    }


}
