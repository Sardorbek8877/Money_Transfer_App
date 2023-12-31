package uz.bek.moneytransferapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.bek.moneytransferapp.entity.Income;
import uz.bek.moneytransferapp.entity.Outcome;

public interface IncomeRepository extends JpaRepository<Income, Integer> {

}
