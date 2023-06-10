package com.example.springneo4jskeleton.demo.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.util.List;

@Node("A")
public class NodeA {
    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    private String internalId;

    @Relationship(type = "A_TO_B")
    private NodeB b;

    public NodeB getB() {
        return b;
    }

    public void setB(NodeB b) {
        this.b = b;
    }
}
