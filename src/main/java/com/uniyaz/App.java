package com.uniyaz;

public class App 
{
    public static void main( String[] args )
    {
        UserDto userDto = new UserDto();
        userDto.setName("Gaye");
        userDto.setSurname("Durmaz");
        userDto.setUserRole(EnumUserRole.ADMIN);

        UserServiceImplService userServiceImplService = new UserServiceImplService();
        userServiceImplService.getUserServicePort().saveUser(userDto);

    }
}
