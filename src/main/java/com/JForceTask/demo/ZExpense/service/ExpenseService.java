package com.JForceTask.demo.ZExpense.service;

import com.JForceTask.demo.ZExpense.Entity.ExpenseEntity;
import com.JForceTask.demo.ZExpense.repo.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    public ExpenseRepo expenseRepo;


    public ExpenseEntity addExpense(ExpenseEntity expenseEntity){
        return expenseRepo.save(expenseEntity);

    }
    public ExpenseEntity updateExpense(Long id, ExpenseEntity expenseEntity) {

        ExpenseEntity oldExpense = expenseRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found"));

        oldExpense.setExpenseName(expenseEntity.getExpenseName());
        oldExpense.setAmount(expenseEntity.getAmount());
        oldExpense.setDate(expenseEntity.getDate());
        oldExpense.setDescription(expenseEntity.getDescription());

        return expenseRepo.save(oldExpense);
    }

}
