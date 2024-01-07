package com.ex2.qna;

import com.ex2.qna.question.Question;
import com.ex2.qna.question.QuestionRepository;
import com.ex2.qna.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;


@SpringBootTest
class QnaApplicationTests {

	@Autowired
	QuestionRepository questionRepository;

	@Autowired
	QuestionService questionService;

	@Test
	void contextLoads() {
	}

	@Test
	public void createQuestion() {
		for(int i = 1; i <= 300; i++) {
			Question question = new Question();
			String subject = String.format("테스트 제목 : [%03d]",i);
			String content = "테스트 제목";
			this.questionService.create(subject,content);
		}
	}

}
