package game;

import com.mysql.fabric.xmlrpc.base.Data;
import domain.DataBase;

import java.util.Scanner;

public class QuestionPanel {
    private static void show() {
        System.out.println("1 - add question\n2 - delete question\n3 - exit");
    }

    private static boolean choose() {
        Scanner r = new Scanner(System.in);
        System.out.print("wybierz:");
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
                System.out.println("3");
                return false;
            }
        }
        return true;

    }
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
    public static void delete(){
        Scanner r = new Scanner(System.in);
        DataBase.delete(r.nextInt());


    }

    public static void main() {
        do {
            show();
        } while (choose());

    }
}