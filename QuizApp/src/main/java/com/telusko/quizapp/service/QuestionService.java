package com.telusko.quizapp.service;

import com.telusko.quizapp.entity.Question;
import com.telusko.quizapp.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo repo;

    public List<Question> getAllQuestions() {

        return repo.findAll();
    }

    // get all data from pgAdmin
    public List<Question> getAllQuestionsByCategory(String category) {
        return repo.findByCategory(category);
    }

    // Add data to the database
    public String addQuestion(Question question) {
        repo.save(question);
        return "Added Successfully!";


    }
}
