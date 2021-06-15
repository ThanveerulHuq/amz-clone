package com.amz.clone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "category")
@Data
public class Category {

    @Id
    private String id;
    private String name;
    private String priority;
    private String parent;


}
