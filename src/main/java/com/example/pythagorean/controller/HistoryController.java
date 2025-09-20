package com.example.pythagorean.controller;


import com.example.pythagorean.entity.History;
import com.example.pythagorean.repository.HistoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/api")
public class HistoryController {

    private final HistoryRepository historyRepository;

    public HistoryController(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    @GetMapping("/history")
    public List<History> getAllHistory() {
        return historyRepository.findAll();
    }

}
