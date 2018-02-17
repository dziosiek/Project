package game;
import domain.DataBase;

import java.util.Scanner;
/**
*Menu class
* @author Adam Wlosek
*/
public class Menu {
    /**
    *Show main menu
*/
    private static void show(){
        System.out.println("1 - new game\n2 - scores\n3 - question panel\n4 - exit ");
    }
    /**
    *
    * run Game.run if selected 1
    * run Question panel if selected 3
    * Exit Game if selected 4
    * @return false if selected 4, and true if selected 1-3
    * */
    private static boolean choose(){
        Scanner r = new Scanner(System.in);
        System.out.print("wybierz:");
        try{
        int c = r.nextInt();
        switch (c){
            case 1:{
                Game.run();break;}
            case 2:{
                break;}
            case 3:{
                QuestionPanel.main();break;
            }
            case 4:{
                return false;}
        }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Invalid character");
        }
        return true;

    }

/**
*Main function of Menu
*/
    public static void main(){
        DataBase.open();
        do{
            show();
        }while(choose());
        DataBase.close();



    }

}
