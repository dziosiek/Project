package game;

import com.mysql.fabric.xmlrpc.base.Data;
import domain.DataBase;

import java.util.Scanner;
/**
*QuestionPanel class
* @author Adam Wlosek
*/
public class QuestionPanel {
    /**
    *printing Question Panel
*/
    private static void show() {
        System.out.println("1 - add question\n2 - delete question\n3 - exit");
    }
    /**
    *
    * run add() if selected 1
    * run delete() if selected 2
    * return false if selected 3
    * @return return false if selected 3, otherwise return true
    * */
    private static boolean choose() {
        Scanner r = new Scanner(System.in);
        System.out.print("wybierz:");
        try{
        int c = r.nextInt();
        switch (c) {
            case 1: {
                add();
                break;
            }
            case 2: {
                delete();
                break;
            }

            case 3: {
                return false;
            }
        }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Invalid character");
        }
        return true;

    }
    /**
    *Function adding question
*/
    public static void add(){
        Scanner r = new Scanner(System.in);
        System.out.print("Podaj tresc:");
        String question = r.nextLine();
        System.out.print("\nPodaj odpowiedz A:");
        String a = r.nextLine();
        System.out.print("\nPodaj odpowiedz B:");
        String b = r.nextLine();
        System.out.print("\nPodaj odpowiedz C:");
        String c = r.nextLine();
        System.out.print("\nPodaj odpowiedz D:");
        String d = r.nextLine();
        System.out.print("\nPodaj poprawna odpowiedz");
        String correct = r.nextLine();
        System.out.print("\nPodaj ilosc punktow za odpowiedz");
        int points = r.nextInt();
        DataBase.fill(question,a,b,c,d,correct,points);


    }
    /**
    *Function deleting question
*/
    public static void delete(){
        Scanner r = new Scanner(System.in);
        DataBase.delete(r.nextInt());


    }
/**
*function run choose() method
*/
    public static void main() {
        do {
            show();
        } while (choose());

    }
}