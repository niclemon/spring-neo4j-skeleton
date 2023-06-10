package com.example.springneo4jskeleton.demo.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@Node("B")
public class NodeB {
    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    private String internalId;
}
