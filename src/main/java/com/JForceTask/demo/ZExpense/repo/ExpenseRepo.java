package com.JForceTask.demo.ZExpense.repo;


import com.JForceTask.demo.ZExpense.Entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<ExpenseEntity,Long> {

}
