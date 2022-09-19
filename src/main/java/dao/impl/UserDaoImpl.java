package dao.impl;

import dao.UserDao;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
   //синглтон ->
    private static final List<User> USER_LIST = new ArrayList<User>();
    static {
        USER_LIST.add(new User("Vasia", "vasia@gmail.com", "fufyumtudyt"));
        USER_LIST.add(new User("Vasia", "vasia@gmail.com", "fufyumtudyt"));
        USER_LIST.add(new User("Vasia", "vasia@gmail.com", "fufyumtudyt"));
    }
    @Override
    public void addUser(User user) {
        if (user != null) {
            USER_LIST.add(user);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return USER_LIST;
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void deleteUser(Long id) {
        USER_LIST.remove(id);
    }
}
