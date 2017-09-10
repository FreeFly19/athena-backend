package com.athena.question.answer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "answers", collectionResourceRel = "answers")
public interface AnswerRestRepository extends JpaRepository<Answer, Long> {
}
