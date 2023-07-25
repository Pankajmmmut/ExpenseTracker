package com.test.ExpenseTracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long expenseId;
    private String title;
    @NotEmpty
    private String description;
    @NotNull
    private Integer price;
    @DateTimeFormat
    private LocalDate date;
    @DateTimeFormat
    private LocalTime time;
    @OneToOne
    @JoinColumn(name = "fk_user_id")
    private User user;
}
