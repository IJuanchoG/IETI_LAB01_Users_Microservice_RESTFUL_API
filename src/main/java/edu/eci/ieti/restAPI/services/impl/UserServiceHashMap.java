package edu.eci.ieti.restAPI.services.impl;

import edu.eci.ieti.restAPI.data.User;
import edu.eci.ieti.restAPI.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type User service hash map.
 */
@Service
public class UserServiceHashMap implements UserService {

    private HashMap<String, User> users = new HashMap<>();

    @Override
    public User create(User user) {
        if(!users.containsKey(user.getId())){
            users.put(user.getId(),user);
        }
        return user;
    }

    @Override
    public User findById(String id) {
        User user = null;
        if(users.containsKey(id)){
            user = users.get(id);
        }
        return user;
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(users.values());
    }

    @Override
    public boolean deleteById(String id) {
        if(users.containsKey(id)){
            users.remove(id);
        }
        return !users.containsKey(id);
    }

    @Override
    public User update(User user, String userId) {
        users.put(userId,user);
        return user;
    }
}
