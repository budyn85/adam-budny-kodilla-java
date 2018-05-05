package com.kodilla.hibernate3.task.dao;

import com.kodilla.hibernate3.task.TaskFinancialDetails;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails, Integer> {
    List<TaskFinancialDetails> findByPaid(final boolean paid);
}
