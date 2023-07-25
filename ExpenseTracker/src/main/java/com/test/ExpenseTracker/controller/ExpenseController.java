package com.test.ExpenseTracker.controller;

import com.test.ExpenseTracker.model.Expense;
import com.test.ExpenseTracker.service.ExpenseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@Api(tags = "Expense Management")
@Validated
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;

    @PostMapping("expense")
    @ApiOperation("Create a expense")
    public String createExpense(@Valid @RequestBody Expense expense){
        return expenseService.createExpense(expense);
    }

    @ApiOperation("Get all expenses")
    @GetMapping("expenses")
    public Iterable getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    @ApiOperation("Get expense by expenseId")
    @GetMapping("expense/{id}")
    public Optional<Expense> getExpensebyId(@PathVariable Long id){
        return expenseService.getExpensebyId(id);
    }

}
