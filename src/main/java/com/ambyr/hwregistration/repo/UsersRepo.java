package com.ambyr.hwregistration.repo;

import com.ambyr.hwregistration.models.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UsersRepo extends Repository<User, Long> {
    List<User> findAll();
    void save(User user);
}
