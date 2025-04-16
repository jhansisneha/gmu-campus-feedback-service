package edu.gmu.swe645.surveyservice;

import org.springframework.data.jpa.repository.JpaRepository;

// Repository interface for StudentSurvey entity
// Provides built-in CRUD operations using JPA
public interface StudentSurveyRepository extends JpaRepository<StudentSurvey, Long> {}
