package com.company;
class Phone {
    void showTime() {
        System.out.println("Time is 8 AM.");
    }
    void callFriend() {
        System.out.println("Calling a friend from Phone.");
    }
}
class SmartPhone extends Phone {
    void playMusic() {
        System.out.println("Playing music.");
    }
    void callFriend() {
        System.out.println("Calling a friend from SmartPhone.");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.showTime();
        obj.callFriend();
        //obj.playMusic() ----> Not Allowed because obj is reference of Phone. It only knows the methods and variables of Phone class.
    }
}
