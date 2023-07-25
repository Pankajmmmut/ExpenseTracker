package com.test.ExpenseTracker.repository;

import com.test.ExpenseTracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExpenseRepo extends JpaRepository<Expense,Long> {
}
