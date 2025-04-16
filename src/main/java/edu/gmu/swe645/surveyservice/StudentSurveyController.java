package edu.gmu.swe645.surveyservice;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// REST controller exposing API endpoints under /api/surveys
@RestController
@RequestMapping("/api/surveys")
public class StudentSurveyController {

    // Injecting the JPA repository to handle database operations
    @Autowired
    private StudentSurveyRepository repo;

    // POST endpoint to create a new survey entry
    @PostMapping
    public StudentSurvey create(@RequestBody StudentSurvey s) {
        return repo.save(s);
    }

    // GET endpoint to retrieve all survey records
    @GetMapping
    public List<StudentSurvey> all() {
        return repo.findAll();
    }

    // GET endpoint to retrieve a specific survey by ID
    @GetMapping("/{id}")
    public StudentSurvey get(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    // PUT endpoint to update an existing survey by ID
    @PutMapping("/{id}")
    public StudentSurvey update(@PathVariable Long id, @RequestBody StudentSurvey s) {
        StudentSurvey old = repo.findById(id).orElseThrow();
        BeanUtils.copyProperties(s, old, "id"); // retain original ID
        return repo.save(old);
    }

    // DELETE endpoint to remove a survey by ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
