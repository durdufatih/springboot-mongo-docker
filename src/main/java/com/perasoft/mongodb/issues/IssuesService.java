package com.perasoft.mongodb.issues;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IssuesService {

    private final IssueRepository issueRepository;

    public Page<Issue> findAll(Pageable pageable) {
        return issueRepository.findAll(pageable);
    }

    public Issue save(Issue issue) {
        return issueRepository.save(issue);
    }
}
