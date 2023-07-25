package com.test.ExpenseTracker.service;

import com.test.ExpenseTracker.model.Expense;
import com.test.ExpenseTracker.repository.IExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpenseService {
    @Autowired
    IExpenseRepo expenseRepo;

    public String createExpense(Expense expense) {
        expenseRepo.save(expense);
        return "expense added.";
    }

    public Iterable getAllExpenses() {
       return expenseRepo.findAll();
    }


    public Optional<Expense> getExpensebyId(Long id) {
        return expenseRepo.findById(id);
    }
}
