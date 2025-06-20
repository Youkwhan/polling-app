package com.polling.pollingapp.services;

import com.polling.pollingapp.model.Poll;
import com.polling.pollingapp.repositories.PollRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }

    // optional because findbyid returns a optional
    public Optional<Poll> getPollById(Long id) {
        return pollRepository.findById(id);
    }
}
