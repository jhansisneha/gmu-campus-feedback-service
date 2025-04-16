package edu.gmu.swe645.surveyservice;

// JPA annotations for ORM mapping
import jakarta.persistence.*;
import java.time.LocalDate;

// This class maps to the "student_survey" table in MySQL RDS
@Entity
public class StudentSurvey {

    // Primary key with auto-generated value
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Survey fields capturing user-provided data from the form
    private String firstName, lastName, streetAddress, city, state, zip;
    private String telephone, email;

    // Stores the date the survey was submitted
    private LocalDate dateOfSurvey;

    // Additional fields capturing user preferences and feedback
    private String likedMost, interestSource, recommendationLikelihood;

    // Standard getters and setters for all fields (used by JPA and controller layer)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getDateOfSurvey() { return dateOfSurvey; }
    public void setDateOfSurvey(LocalDate dateOfSurvey) { this.dateOfSurvey = dateOfSurvey; }

    public String getLikedMost() { return likedMost; }
    public void setLikedMost(String likedMost) { this.likedMost = likedMost; }

    public String getInterestSource() { return interestSource; }
    public void setInterestSource(String interestSource) { this.interestSource = interestSource; }

    public String getRecommendationLikelihood() { return recommendationLikelihood; }
    public void setRecommendationLikelihood(String recommendationLikelihood) { this.recommendationLikelihood = recommendationLikelihood; }
}
