package com.bezkoder.spring.jpa.postgresql.service;


import com.bezkoder.spring.jpa.postgresql.model.Tutorial;
import com.bezkoder.spring.jpa.postgresql.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

// for test
public class TutorialService {
    private final TutorialRepository tutorialRepository;
    public List<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }
}