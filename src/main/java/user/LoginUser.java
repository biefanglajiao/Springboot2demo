package user;

import lombok.Data;

import java.util.Date;

@Data
public class LoginUser {
    int id;
    String username;
    String upassword;
    String groupid;
    Date regtime;

}
