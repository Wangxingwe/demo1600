package com.ax.javaspringboot.mappers;

import com.ax.javaspringboot.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author wangxingwei
 * Date 2024/3/18 11:22
 * Version 1.0
 */
@Repository
public interface UserMapper {
    List<User> selectUser();
}
