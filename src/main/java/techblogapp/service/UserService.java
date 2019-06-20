package techblogapp.service;

import org.springframework.stereotype.Service;
import techblogapp.model.User;

@Service
public class UserService {

    public boolean loginUser(User user){
        if(user.getUsername().equals("Aniket") && user.getPassword().equals("Ani@123")){
            return true;
        }
        else
        {
            return false;
        }
    }
}
