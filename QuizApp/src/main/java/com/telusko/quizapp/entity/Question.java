package com.telusko.quizapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String category;
    private String difficultylevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questionTitle;
    private String rightAnswer;

    public Question() {
        super();
    }

    public Question(String category, String difficultylevel, String option1, String option2, String option3, String option4, String questionTitle, String rightAnswer) {
        this.category = category;
        this.difficultylevel = difficultylevel;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.questionTitle = questionTitle;
        this.rightAnswer = rightAnswer;
    }
}
