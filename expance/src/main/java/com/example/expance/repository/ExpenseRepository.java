package com.example.expance.repository;


import com.example.expance.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findBySplitsUserId(Long userId);
}
