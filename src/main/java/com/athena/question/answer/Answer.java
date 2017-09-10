package com.athena.question.answer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Answer implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    private boolean isCorrect;
}
