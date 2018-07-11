package com.ssh.service;

import com.ssh.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/7/11.
 */

public interface UserService {
    Integer saveUser (User user);
    Integer saveUser();
}
