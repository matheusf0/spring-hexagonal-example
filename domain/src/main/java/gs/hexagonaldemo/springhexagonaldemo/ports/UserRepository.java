package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.User;

import java.util.List;

public interface UserRepository {

    int addUser(User newUser);

    List<User> getUsers();

    void deleteUser(int id);

}
