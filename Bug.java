package edu.sjsu;

public class Bug {
    int position;
    boolean on = false;

    Bug(){

    }
    public Bug(int initialPosition){
        position = initialPosition;
    }
    public void turnOn(){
        on = true;
    }
    public void move(){
        if (on && position >=1)
            position++;

    }

    public void turn(){
        position--;

    }

    public int getPosition(){
        return position;

    }

}
