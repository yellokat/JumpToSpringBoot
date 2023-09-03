package com.example.jumpToSpring.question;

import com.example.jumpToSpring.answer.Answer;
import com.example.jumpToSpring.answer.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;

    public void create(Question question, String content){
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }
}
