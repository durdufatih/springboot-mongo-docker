package com.perasoft.mongodb.issues;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "issues")
@Data
@AllArgsConstructor
public class Issue {

    @Id
    private String id;
    private String description;
    private int severity;
    private String assignee;


}