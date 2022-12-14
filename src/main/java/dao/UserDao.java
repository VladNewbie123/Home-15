package dao;

import model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getAllUsers();
    void updateUser(Long id);
    void deleteUser(Long id);
}
