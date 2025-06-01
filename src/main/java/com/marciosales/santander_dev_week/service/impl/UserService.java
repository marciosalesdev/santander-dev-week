package com.marciosales.santander_dev_week.service.impl;

import com.marciosales.santander_dev_week.domain.model.User;

public interface UserService {

    User findById(Long id);

    User createUser(User user);
}
