package com.example.restapi.Model;




import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

     private String login, id, name, full_name, created_at;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    //      char login;
//      Integer id;
//      char name;
//      char full_name;
//      LocalDateTime created_at;
//      LocalDateTime updated_at;
//      LocalDateTime pushed_at;
//
//    public char getLogin() {
//        return login;
//    }
//
//    public void setLogin(char login) {
//        this.login = login;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public char getName() {
//        return name;
//    }
//
//    public void setName(char name) {
//        this.name = name;
//    }
//
//    public char getFull_name() {
//        return full_name;
//    }
//
//    public void setFull_name(char full_name) {
//        this.full_name = full_name;
//    }
//
//    public LocalDateTime getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(LocalDateTime created_at) {
//        this.created_at = created_at;
//    }
//
//    public LocalDateTime getUpdated_at() {
//        return updated_at;
//    }
//
//    public void setUpdated_at(LocalDateTime updated_at) {
//        this.updated_at = updated_at;
//    }
//
//    public LocalDateTime getPushed_at() {
//        return pushed_at;
//    }
//
//    public void setPushed_at(LocalDateTime pushed_at) {
//        this.pushed_at = pushed_at;
//    }
//
//    public User(char login, Integer id, char name, char full_name, LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime pushed_at) {
//        this.login = login;
//        this.id = id;
//        this.name = name;
//        this.full_name = full_name;
//        this.created_at = created_at;
//        this.updated_at = updated_at;
//        this.pushed_at = pushed_at;
//    }
//
//    public User() {
//    }


}
