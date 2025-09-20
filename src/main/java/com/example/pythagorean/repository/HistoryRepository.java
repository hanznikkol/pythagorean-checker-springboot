package com.example.pythagorean.repository;

import com.example.pythagorean.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {

}
