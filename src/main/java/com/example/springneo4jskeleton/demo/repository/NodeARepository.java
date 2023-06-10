package com.example.springneo4jskeleton.demo.repository;

import com.example.springneo4jskeleton.demo.model.NodeA;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeARepository extends Neo4jRepository<NodeA, String> {
}

