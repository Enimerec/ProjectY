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
public class InstructorShortDto {
    private Integer userId;
    private String fullName;
    private String instNumber;
}
