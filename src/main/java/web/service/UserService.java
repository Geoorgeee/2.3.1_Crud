package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;
@Service
public interface UserService {
    void addUser(User user);

    User getUser(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    void removeUser(long id);
}
