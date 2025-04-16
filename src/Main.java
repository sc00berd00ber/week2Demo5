import java.util.Scanner;

/*
 * A game has a beginning,
 * a wat to move forward,
 * goal,
 * obstacle, enemy or opponent
 *
 */
public class Main {
    public static void main(String[] args) {
        //char[] board = {'@', '.', '.', 'Z', '.', '.', '.', '$'}; //8 positions
        char floor = '.';
        char hero = '@';
        char enemy = 'Z';
        char treasure = '$';
        int heroPosition = 0;
        int enemyPosition = 3;
        int treasurePosition = 7;
        Scanner in = new Scanner(System.in);
        //infinite loop - must break out when something happens like getting the treasure
        System.out.println("Welcome to the game, press ENTER/RETURN to push forward.");
        int turn = 1;
        while(true){
            System.out.printf("Turn %d:\n", turn++);
            //display board
            for(int i = 0; i < 8; i++){
                if(i == heroPosition){
                    System.out.print(hero);
                }else if(i == enemyPosition){
                    System.out.print(enemy);
                }else if(i == treasurePosition){
                    System.out.print(treasure);
                }else{
                    System.out.print(floor);
                }
            }
            System.out.println("Enter to push forward.");
            String userInput = in.nextLine();
            //UPDATE THE STATE
            heroPosition++; //move forward
            //COLLISION DETECTION
            if(heroPosition == enemyPosition){
                enemyPosition = -1;//remove enemy
                System.out.println("Hero has vanquished the enemy!!!");
            }
            if(heroPosition == treasurePosition){
                enemyPosition = -1;//remove treasure
                System.out.println("Hero has taken the treasure!!!");
                break; //break out of infinite loop.
            }
        }
        System.out.println("GAME OVER!!!");
    }
}