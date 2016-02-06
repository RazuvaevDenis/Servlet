package netcracker;

import java.util.HashMap;

public class CreateUser {
    public HashMap createProperties(){
        HashMap<String,String> property=new HashMap<>();
        property.put("user","test");
        property.put("password","test");
        return property;
    }

    public User createUser(){
        User user=new User();
        user.setFio("Ivanov Ivan");
        user.setEmail("test@mail.ru");
        user.setAge("20");
        user.setNumber("123456789");
        return user;
    }
}
