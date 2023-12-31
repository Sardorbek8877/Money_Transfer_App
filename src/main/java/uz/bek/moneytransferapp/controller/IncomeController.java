package uz.bek.moneytransferapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.bek.moneytransferapp.entity.Income;
import uz.bek.moneytransferapp.repository.IncomeRepository;
import uz.bek.moneytransferapp.service.IncomeService;

import java.util.List;

@RestController
@RequestMapping("/api/income")
public class IncomeController {

    @Autowired
    IncomeService incomeService;

    @GetMapping
    public ResponseEntity<List<Income>> getIncomes(){
        List<Income> incomes = incomeService.getIncomes();
        return ResponseEntity.ok(incomes);
    }
}
