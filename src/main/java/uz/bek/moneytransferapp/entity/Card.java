package uz.bek.moneytransferapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Card {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;

    @Column(nullable = false, unique = true)
    private String cardNumber;

    private double balance;

    private Date expired_date;

    private boolean active;
}
