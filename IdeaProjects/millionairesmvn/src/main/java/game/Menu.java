package game;
import java.util.Scanner;
public class Menu {
    private static void show(){
        System.out.println("1 - new game\n2 - scores\n3 - question panel\n4 - exit ");
    }
    private static boolean choose(){
        Scanner r = new Scanner(System.in);
        int c = r.nextInt();
        switch (c){
            case 1:{
                System.out.println("1");Game.run();break;}
            case 2:{
                System.out.println("2");break;}
            case 3:{
                QuestionPanel.main();break;
            }
            case 4:{
                System.out.println("3");return false;}
        }
        return true;

    }


    public static void main(){
        do{
            show();
        }while(choose());



    }

}
