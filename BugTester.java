package edu.sjsu;

public class BugTester {
    public static void main(String[] args){
        Bug bug = new Bug(10);
        bug.turnOn();
        System.out.println("Initial position is " + bug.getPosition());
        bug.move();
        bug.move();
        bug.move();
        bug.move();
        bug.move();
        System.out.println("Bug after moving " + bug.getPosition());
        bug.turn();
        System.out.println("Bug after turning " + bug.getPosition());






    }
}
