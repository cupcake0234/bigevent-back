package com.sptj.service;

import com.sptj.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User findByUserName(String username);

    void register(String username, String password);

    void update(User user);

    void updateAvatar(String avatarUrl);

    void updatePwd(String newPwd);
}
