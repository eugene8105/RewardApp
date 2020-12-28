package app.custom.reward.service;

import app.custom.reward.dto.UserRepository;
import app.custom.reward.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserListServerImpl implements UserListService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser() {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList :: add);
        return userList;
    }
}
