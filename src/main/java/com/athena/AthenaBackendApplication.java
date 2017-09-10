package com.athena;

import com.athena.question.Question;
import com.athena.question.QuestionRestRepository;
import com.athena.question.answer.Answer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AthenaBackendApplication {

	@Bean
	CommandLineRunner lineRunner(QuestionRestRepository questionRestRepository) {
		return (args) -> {
			Question q = new Question();
			q.setContent("1+2");
			Answer a1 = new Answer();
			a1.setContent("2");
			Answer a2 = new Answer();
			a2.setContent("3");
			a2.setCorrect(true);
			Answer a3 = new Answer();
			a3.setContent("4");

			q.getAnswers().add(a1);
			q.getAnswers().add(a2);
			q.getAnswers().add(a3);

			questionRestRepository.save(q);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AthenaBackendApplication.class, args);
	}
}
