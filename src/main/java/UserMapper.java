import models.User;
import org.mapstruct.Mapper;

/**
 * JMA - 19/10/2019 20:01
 **/
@Mapper
public interface UserMapper {
    User convertToOtherUser(User user);
}
