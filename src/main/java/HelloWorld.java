import models.User;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.factory.Mappers;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(StringUtils.capitalize("hello world"));
        //MAp struct
        User user1 = User.builder().firstName("Is's me!").build();
        User user2 = Mappers.getMapper(UserMapper.class).convertToOtherUser(user1);
        System.out.println(user1.getFirstName());
        System.out.println(user2.getFirstName());
    }
}
