import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JMA - 19/10/2019 19:50
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private String userName;
    private Long id;

}
