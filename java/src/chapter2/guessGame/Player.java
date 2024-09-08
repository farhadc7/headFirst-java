package chapter2.guessGame;

import java.util.Random;

public class Player {
    int number;
    public void guess(){
        number= (int) (Math.random()*10);
    }
}
