package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
*@author Adam Wlosek
* Questions class
*
*/

@Entity
public class Questions {
    @Id
    @GeneratedValue
    private int id;
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correctAnswer;
    private int points;
/**
* get points
* @return points
*/
    public int getPoints() {
        return points;
    }
/**
* set points
* @param points amount of points
* @return none
*/
    public void setPoints(int points) {
        this.points = points;
    }

/**
* get Id
* @return id
*/

    public int getId() {
        return id;
    }
/**
* set points
* @param id id of record
* @return none
*/
    public void setId(int id) {
        this.id = id;
    }
/**
*get content of the question
* @return question
*/
    public String getQuestion() {
        return question;
    }
/**
*set a question
* @param question content of the question
*/
    public void setQuestion(String question) {
        this.question = question;
    }
/**
*get first answer
* @return content of first answer
*/
    public String getAnswerA() {
        return answerA;
    }
/**
*set first answer
* @param answerA content of first answer
*/
    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }
/**
*get second answer
* @return content of second answer
*/
    public String getAnswerB() {
        return answerB;
    }
/**
*set second answer
* @param answerB content of second answer
*/
    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }
/**
*get third answer
* @return content of third answer
*/
    public String getAnswerC() {
        return answerC;
    }
/**
*get third answer
* @param answerC content of third answer
*/
    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }
/**
*get fourth answer
* @return content of fourth answer
*/
    public String getAnswerD() {
        return answerD;
    }
/**
*get fourth answer
* @param answerD content of fourth answer
*/
    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }
/**
*get correct answer
* @return correct answer
*/
    public String getCorrectAnswer() {
        return correctAnswer;
    }
/**
*set correct answer
* @param correctAnswer correct answer
*/
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
