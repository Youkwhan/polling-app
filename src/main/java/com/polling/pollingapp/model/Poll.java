package com.polling.pollingapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;

    @ElementCollection // jpa annotation, create separate table 'poll_options' in db without new entity
    private List<OptionVote> options = new ArrayList<>();

// Refactor: votes should be associated with options and not just 'id'.
// we use this bcz this entity is pretty simple ('poll_votes' table with id and votes)
//    @ElementCollection
//    private List<Long> votes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<OptionVote> getOptions() {
        return options;
    }

    public void setOptions(List<OptionVote> options) {
        this.options = options;
    }
}
