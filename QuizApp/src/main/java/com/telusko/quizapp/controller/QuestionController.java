package com.telusko.quizapp.controller;

import com.telusko.quizapp.entity.Question;
import com.telusko.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getAllQuestionsByCategory(@PathVariable String category) {
        return questionService.getAllQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

//    {
//
//        " category": "Python ",
//            "difficultylevel": "Easy",
//            "option1":"int",
//            "option2":"float",
//            "option3":"str",
//            "option4":" list",
//            "question_title":"In Python which data type is mutable?",
//            "right_answer)":"list"
//    }

}
