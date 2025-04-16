
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char[] board = {'@', '.', '.', 'Z', '.', '.', '.', '$'};
        char floor = '.';
        char hero = '@';
        char enemy = 'Z';
        char treasure = '$';
        int heroPosition = 0;
        int enemyPosition = 3;
        int treasurePosition = 7;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the game\n Press ENTER to push forward.");
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
            heroPosition++; //move forward
            if(heroPosition == enemyPosition){
                enemyPosition = -1;//remove enemy
                System.out.println("Hero has destoryed the enemy!!!");
            }
            if(heroPosition == treasurePosition){
                enemyPosition = -1;//remove treasure
                System.out.println("Hero has taken the treasure!!!");
                break;
            }
        }
        System.out.println("GAME OVER!!!");
    }
}
