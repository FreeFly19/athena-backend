package com.athena.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "questions", collectionResourceRel = "questions", excerptProjection = QuestionWithAnswers.class)
public interface QuestionRestRepository extends JpaRepository<Question, Long> {

}
