package com.javaquarium.repository;

import com.javaquarium.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2016/8/20.
 */
@Transactional
public interface UserReposity extends CrudRepository<User, Long> {
    public List<User> findAll();
}
