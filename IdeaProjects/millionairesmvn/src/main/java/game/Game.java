package game;

import domain.DataBase;
import domain.Questions;

import java.util.Random;
import java.util.Scanner;
/**
*@author Adam Wlosek
* Game Class
*/

public class Game {
    static Random rand = new Random();
/**
* Function includes game engine. It generates question and printing it on the screen. User
* must choose answer.
*/
    public static void run(){
        int generator = 0;
        int number_of_question = 1;
        int total_points = 0;
        Questions q;
        boolean wrong_answer = false;
        while(!wrong_answer){
            do {
                generator=(generator+rand.nextInt(20))%616;
                q = DataBase.load(generator);

            } while (q == null);

            System.out.println("Pytanie " + number_of_question + ":" + q.getQuestion());
            System.out.println("odpowiedz a)" + q.getAnswerA());
            System.out.println("odpowiedz b)" + q.getAnswerB());
            System.out.println("odpowiedz c)" + q.getAnswerC());
            System.out.println("odpowiedz d)" + q.getAnswerD());
            System.out.println("ilosc punktow za pytanie:"+q.getPoints());
            Scanner r = new Scanner(System.in);
            System.out.print("Podaj odpowiedź:");
            String answer;
            do {
                answer = r.nextLine();
            } while (!answer.matches("a|b|c|d"));
            if (answer.equals(q.getCorrectAnswer())) {
                total_points += q.getPoints();
                number_of_question++;
            } else wrong_answer =true;
            System.out.println();
        }
        System.out.println("zdobyles "+total_points+" punktow.");

    }



}
