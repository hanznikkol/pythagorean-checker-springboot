package com.example.pythagorean.controller;

import com.example.pythagorean.entity.History;
import com.example.pythagorean.repository.HistoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CheckController {

    private final HistoryRepository historyRepository;

    public CheckController(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    @GetMapping("/check")
    public Map<String,Object> check(@RequestParam("value") long value){
        Map<String,Object> resp = new HashMap<>();

        boolean found = false;

        int c = (int) Math.sqrt(value);
        int a = 0, b = 0;

        if((long)c*c == value){
            for(a = 1; a < c; a++){
                int b2 = c*c - a*a;
                int bCandidate = (int)Math.sqrt(b2);
                if(bCandidate*bCandidate == b2){
                    b = bCandidate;
                    found = true;
                    break;
                }
            }
        }

        History history = new History();
        history.setInputValue(value);
        history.setCreatedAt(LocalDateTime.now());

        if(found){
            double avg = (a + b + c)/3.0;
            resp.put("A", a);
            resp.put("B", b);
            resp.put("C", c);
            resp.put("AVG", avg);

            history.setA(a);
            history.setB(b);
            history.setC(c);
            history.setAvg(avg);
        }

        historyRepository.save(history);
        return resp;
    }
}
