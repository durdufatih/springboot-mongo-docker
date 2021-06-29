package com.perasoft.mongodb.issues;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("issues")
@AllArgsConstructor
public class IssuesController {

    private final IssuesService issuesService;

    @GetMapping
    public Page<Issue> findAll(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size", defaultValue = "10") int size) {
        return issuesService.findAll(PageRequest.of(page, size));
    }

    @PostMapping
    public Issue save(@RequestBody Issue issue){
        return issuesService.save(issue);
    }
}
