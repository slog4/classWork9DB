package com.company;

import task2.User;
import task2.Users;

public class Main {
    public static void main(String[] args) {
       User user1 = new User("user1","1111","name User1");
        User user2 = new User("user2","222","name User2");
        User user3 = new User("user3","333","name User3");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println("");
     Users users = new Users();

        users.addUser(user1);
        users.addUser(user2);
        users.addUser(user3);
        System.out.println(users);
        users.removeUser(1);
        System.out.println(users);
        users.clearUser();
        System.out.println(users);
        User user4 = new User("user1","111","User1");
        users.addUser(user4);
        System.out.println(users);
        System.out.println(users.searchUsers("User"));

    }
}
