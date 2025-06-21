package com.polling.pollingapp.model;

import jakarta.persistence.Embeddable;

@Embeddable // This means that the class is not a standalone entity but can be embedded as a part of another entity. Like a field
public class OptionVote {
    private String voteOption;
    private Long voteCount = 0L;

    public OptionVote() {}
    public String getVoteOption() {
        return voteOption;
    }

    public void setVoteOption(String voteOption) {
        this.voteOption = voteOption;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
