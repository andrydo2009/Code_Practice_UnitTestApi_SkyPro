package com.pro.sky.unittestapi.modelTest;


import com.pro.sky.unittestapi.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    String loginUser = "studentSkyPro";
    String mailUser = "student@skypro.com";
    String inValidMailUser="studentskyprocom";

    User userTest = new User ( loginUser , mailUser );

    @Test//1
    public void createUser() {
        Assertions.assertEquals ( loginUser , userTest.getLoginUser () );
        Assertions.assertEquals ( mailUser , userTest.getMailUser () );
        /*Метод имеет два параметра и проверяет, что два объекта или примитива равны друг другу.
        Для проверки объектов на равенство у них должен быть реализован метод equals.*/
    }

    @Test//2
    public void createEmptyUser() {
        User userEmptyTest = new User ();
        Assertions.assertNull ( userEmptyTest.getLoginUser () );
        Assertions.assertNull ( userEmptyTest.getLoginUser () );
        /* Метод имеет один параметр и проверяет, что переданный в него объект или результат выполнения метода является null */
    }

    @Test//3
    public void validParameter() {
        Assertions.assertDoesNotThrow (  () -> {
            new User ( loginUser , inValidMailUser);
        } );
        /*Метод имеет один параметр в виде лямбды без параметров, которая вызывает проверяемый код.
          Проверяет, что данный код не выкидывает исключение.*/
    }


    @Test//4
    public void compareLoginAndMail() {
        Assertions.assertDoesNotThrow (  () -> {
            new User ( loginUser , loginUser);
        } );
    }

}
