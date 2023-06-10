package com.example.springneo4jskeleton.demo;

import com.example.springneo4jskeleton.demo.model.NodeA;
import com.example.springneo4jskeleton.demo.model.NodeB;
import com.example.springneo4jskeleton.demo.repository.NodeARepository;
import com.example.springneo4jskeleton.demo.repository.NodeBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {
    @Autowired
    NodeARepository nodeARepository;

    @Autowired
    NodeBRepository nodeBRepository;

    @Override
    public void run(ApplicationArguments args) {
        // A
        var b = new NodeB();
        this.nodeBRepository.save(b);

        // B
        var a = new NodeA();
        a.setB(b);
        this.nodeARepository.save(a);

        // Find All
        var aList = this.nodeARepository.findAll();
    }
}
