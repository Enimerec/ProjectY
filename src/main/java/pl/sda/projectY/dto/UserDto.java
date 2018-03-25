package pl.sda.projectY.dto;

import lombok.*;
import pl.sda.projectY.type.Role;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Integer userId;
    private String login;
    private String password;
    private Role role;

}
