package service;

import dao.UserDao;
import model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    void updateUser(Long id);

    void deleteUser(Long id);
}
