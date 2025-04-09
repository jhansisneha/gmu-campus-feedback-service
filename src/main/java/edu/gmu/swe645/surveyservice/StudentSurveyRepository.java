package edu.gmu.swe645.surveyservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSurveyRepository extends JpaRepository<StudentSurvey, Long> {}
