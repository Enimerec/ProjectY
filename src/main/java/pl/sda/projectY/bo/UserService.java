package pl.sda.projectY.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.projectY.dto.UserDto;
import pl.sda.projectY.entity.User;
import pl.sda.projectY.repository.UserRepository;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void changePassword(int userId, UserDto user) {
        User newUser = userRepository.findOne(userId);
        newUser.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.delete(userId);
        userRepository.save(newUser);
    }
}
