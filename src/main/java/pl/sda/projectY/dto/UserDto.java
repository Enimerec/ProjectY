package pl.sda.projectY.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Integer userId;
    private String login;
    private String password;
    private String roleId;
}
