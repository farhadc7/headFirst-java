package chapter2.guessGame;

public class GuessGame {
    private Player p1= new Player();
    private Player p2= new Player();
    private Player p3 = new Player();

    int p1Guess=0;
    int p2Guess=0;
    int p3Guess=0;

    boolean p1IsRight=false;
    boolean p2IsRight=false;
    boolean p3IsRight=false;
    public void startGame(){
        int randomNumber= (int) (Math.random()*10);
        while(true){
            System.out.println("the number to be guessed is :"+randomNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            int p1Guess= p1.number;
            int p2Guess= p2.number;
            int p3Guess= p3.number;

            if(p1Guess == randomNumber){
                p1IsRight= true;
            }
            if(p2Guess == randomNumber){
                p2IsRight= true;
            }
            if(p3Guess == randomNumber){
                p3IsRight= true;
            }

            System.out.println("player one guess is: "+p1.number);
            System.out.println("player two guess is: "+p2.number);
            System.out.println("player three guess is: "+p3.number);

            if(p1IsRight || p2IsRight || p3IsRight){
                System.out.println("player 1 got it right :"+ p1IsRight);
                System.out.println("player 2 got it right :"+ p3IsRight);
                System.out.println("player 3 got it right :"+ p2IsRight);

                break;
            }else{
                System.out.println("players must try again");
            }
        }


    }
}
