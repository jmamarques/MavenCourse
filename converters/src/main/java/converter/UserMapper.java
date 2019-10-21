package converter;

import models.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * JMA - 21/10/2019 20:45
 **/
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User sample(User user);
}
