package jdbc.users;

import lombok.Data;

import java.util.NoSuchElementException;

@Data
public class User {
    private String userid;
    private String username;
    private String userpassword;
    private int userage;
    private String useremail;
}
