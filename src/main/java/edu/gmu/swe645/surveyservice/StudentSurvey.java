package edu.gmu.swe645.surveyservice;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class StudentSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName, lastName, streetAddress, city, state, zip;
    private String telephone, email;
    private LocalDate dateOfSurvey;
    private String likedMost, interestSource, recommendationLikelihood;

    // Getters and setters
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