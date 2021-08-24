package task2;

import task2.User;

public interface IUser {
    void addUser(User user);
    void removeUser(int id);
    void clearUser();
    String toString();
    String searchUsers(String user);

}
