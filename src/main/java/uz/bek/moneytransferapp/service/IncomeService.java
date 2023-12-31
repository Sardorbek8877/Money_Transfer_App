package uz.bek.moneytransferapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.bek.moneytransferapp.entity.Income;
import uz.bek.moneytransferapp.repository.IncomeRepository;

import java.util.List;

@Service
public class IncomeService {

    @Autowired
    IncomeRepository incomeRepository;

    public List<Income> getIncomes(){
        return incomeRepository.findAll();
    }
}
