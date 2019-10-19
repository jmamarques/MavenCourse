package models;

import lombok.*;

/**
 * JMA - 19/10/2019 19:50
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private String userName;
    private Long id;

}
