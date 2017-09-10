package com.athena.question;

import com.athena.question.answer.Answer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Question implements QuestionWithAnswers {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @JsonProperty("questions")
    @OneToMany(mappedBy = "question", cascade = CascadeType.PERSIST)
    private List<Answer> answers = new ArrayList<>();
}


@Projection(name = "withAnswers", types = Question.class)
interface QuestionWithAnswers {
    Long getId();
    String getContent();
    List<Answer> getAnswers();
}