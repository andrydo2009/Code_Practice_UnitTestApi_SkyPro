package com.pro.sky.unittestapi.model;


import lombok.Data;


import java.util.Objects;

@Data
public class User {
    private String loginUser;
    private String mailUser;


    public User() {
    }

    public User(String loginUser , String mailUser) throws IllegalArgumentException {
        this.loginUser = loginUser;
        if (!mailUser.contains ( "@" )||!mailUser.contains ( "." )||mailUser.equals ( loginUser )) {
            throw new IllegalArgumentException("Введен некорректный адрес");
        }
        this.mailUser = mailUser;
    }

    public String getLoginUser() {
        return loginUser;
    }


    public String getMailUser() {
        return mailUser;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        User user = (User) o;
        return Objects.equals ( loginUser , user.loginUser ) && Objects.equals ( mailUser , user.mailUser );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( loginUser , mailUser );
    }

}
