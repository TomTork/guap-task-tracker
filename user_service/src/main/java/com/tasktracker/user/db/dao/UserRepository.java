package com.tasktracker.user.db.dao;

import com.tasktracker.user.db.model.User;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@NullMarked
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAll();
    User findUserById(Integer id);
}
