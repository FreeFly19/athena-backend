package com.athena.question.answer;

import com.athena.question.Question;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Answer implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    private boolean isCorrect;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;
}
