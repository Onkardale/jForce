package com.JForceTask.demo.ZExpense.controller;

import com.JForceTask.demo.ZExpense.Entity.ExpenseEntity;
import com.JForceTask.demo.ZExpense.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExpenseController {

    @Autowired
    public ExpenseService expenseservice;

    @PostMapping("/addExpense")
    public ExpenseEntity save(@RequestBody ExpenseEntity expenseEntity){
        return expenseservice.addExpense(expenseEntity);
    }

    @PutMapping("/updateExpense/{id}")
    public ExpenseEntity updateExpense(
            @PathVariable Long id,
            @RequestBody ExpenseEntity expenseEntity) {

        return expenseservice.updateExpense(id, expenseEntity);
    }

}
