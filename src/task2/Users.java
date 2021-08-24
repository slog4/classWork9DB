package task2;

import java.util.Arrays;
import java.util.Locale;

public class Users implements IUser {

    private User[]user;
    private int size=0;
    private int id=1;


    public Users(){
        user = new User[size];


    }

    @Override
    public void addUser(User user) {
        if(size > this.user.length){
            this.user[size] = user;
            }else {

            this.user = Arrays.copyOf(this.user,this.user.length+1);
            this.user[size]=user;
           this.size++;

           user.setiD(id++);

          }


    }

    @Override
    public void removeUser(int iD) {
        for (int i = 0; i < user.length; i++) {
            if(user[i].getiD()==iD){
                user[i].setDeleted(true);
            }
        }

    }

    @Override
    public void clearUser() {
        int counter = 0;
        for (int i = 0; i < user.length; i++) {
            if(user[i].isDeleted()==true){
                counter++;
            }
        }
        User[]temp = new User[user.length - counter];
        size=size-counter;
        counter = 0;
        for (int i = 0; i < user.length; i++) {
            if(user[i].isDeleted()==false){
                temp[counter]= user[i];
                counter++;
            }
        }
        this.user=temp;



    }

    @Override
    public String toString() {
       return " User= "+Arrays.toString(user);
    }

    @Override
    public String searchUsers(String user) {
        for (int i = 0; i < this.user.length; i++) {
            if(this.user[i].getName().contains(user)){
                return this.user[i].toString();
            }

        }
        return null;
    }


    }




