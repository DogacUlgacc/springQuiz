package com.spring.quizapp.service;

import com.spring.quizapp.dao.QuestionDAO;
import com.spring.quizapp.dao.QuizDAO;
import com.spring.quizapp.model.Question;
import com.spring.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class QuizService {

    @Autowired
    QuizDAO quizDao;
    @Autowired
    QuestionDAO questionDao;
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}

