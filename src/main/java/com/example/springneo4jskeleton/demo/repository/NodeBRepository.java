package com.example.springneo4jskeleton.demo.repository;

import com.example.springneo4jskeleton.demo.model.NodeB;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeBRepository extends Neo4jRepository<NodeB, String> {
}

