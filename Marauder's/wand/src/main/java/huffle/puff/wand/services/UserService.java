package huffle.puff.wand.services;

import java.util.List;

import huffle.puff.wand.dtos.UserDto;

public interface UserService {
    	//CREATE
   UserDto createUser( UserDto userDto);
   
   // UPDATE
    UserDto updateUser( UserDto userDto , String userId);
    
    //DELETE
    void deleteUser(String userId);


    
    //GET ALL USER
    List<UserDto> getAllUsers();

    
    
    //get single user by id
    UserDto getUserById(String userId);

    
    
    //get single user by email
    UserDto getUserByEmail(String email);


    
    
    //search user
    List<UserDto> searchUser(String keywords);

    
    
    //other user specific details
}

