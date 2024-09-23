package Test_Task.Vlad.Kulishov.service;

import Test_Task.Vlad.Kulishov.dto.UserDto;
import Test_Task.Vlad.Kulishov.entity.User;

import java.util.List;

public interface UserService {


    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}




