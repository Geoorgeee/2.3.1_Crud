package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {
    void addUser(User user);

    User getUser(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    void removeUser(long id);
}
