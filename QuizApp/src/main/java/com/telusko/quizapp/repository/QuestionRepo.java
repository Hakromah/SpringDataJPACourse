package com.telusko.quizapp.repository;

import com.telusko.quizapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);
}
