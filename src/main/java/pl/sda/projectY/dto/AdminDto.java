package pl.sda.projectY.dto;

import lombok.*;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto extends UserDto{

    private String name;
    private String surname;
    private String telephone;
    private String eMail;

}
