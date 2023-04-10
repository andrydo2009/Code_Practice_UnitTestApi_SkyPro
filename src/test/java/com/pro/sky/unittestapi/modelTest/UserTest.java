package com.pro.sky.unittestapi.modelTest;


import com.pro.sky.unittestapi.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    String loginUser = "studentSkyPro";
    String mailUser = "student@skypro.com";
    User userTest=new User (loginUser,mailUser);

    @Test
    public void createUser() {
        Assertions.assertEquals ( loginUser , userTest.getLoginUser () );
        Assertions.assertEquals ( mailUser , userTest.getMailUser () );
        /*Метод имеет два параметра и проверяет, что два объекта или примитива равны друг другу.
        Для проверки объектов на равенство у них должен быть реализован метод equals.*/
    }

    @Test
    public void createEmptyUser() {
        User userEmptyTest = new User ();
        Assertions.assertNull ( userEmptyTest.getLoginUser () );
        Assertions.assertNull ( userEmptyTest.getLoginUser () );
        /* Метод имеет один параметр и проверяет, что переданный в него объект или результат выполнения метода является null */
    }

    @Test
    public void validParameter(){
        Assertions.assertTrue ( userTest.getMailUser ().contains ( "@" ));
        Assertions.assertTrue ( userTest.getMailUser ().contains ( "." ));
        /*Метод имеет один параметр и проверяет, что переданный в него объект или результат выполнения метода возвращает true*/
    }

    @Test
    public void compareLoginAndMail(){
        Assertions.assertNotEquals ( userTest.getLoginUser (),userTest.getMailUser () );
        /*Метод имеет два параметра и проверяет, что два объекта или примитива не равны друг другу.
        Для проверки объектов на равенство у них должен быть реализован метод equals.*/
    }


}
