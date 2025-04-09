package edu.gmu.swe645.surveyservice;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
public class StudentSurveyController {

    @Autowired
    private StudentSurveyRepository repo;

    @PostMapping
    public StudentSurvey create(@RequestBody StudentSurvey s) {
        return repo.save(s);
    }

    @GetMapping
    public List<StudentSurvey> all() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public StudentSurvey get(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public StudentSurvey update(@PathVariable Long id, @RequestBody StudentSurvey s) {
        StudentSurvey old = repo.findById(id).orElseThrow();
        BeanUtils.copyProperties(s, old, "id");
        return repo.save(old);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}