package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserDao {
    private static final UserDaoImpl UDI = new UserDaoImpl();

    @Override
    public void addUser(User user) {
        if (user != null) {
            UDI.addUser(user);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return UDI.getAllUsers();
    }

    @Override
    public void updateUser(Long id) {

    }


    @Override
    public void deleteUser(Long id) {
        UDI.deleteUser(id);
    }
}
