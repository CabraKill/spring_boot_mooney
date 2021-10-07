package com.raph.mooney.demo.domain.entities;

import java.time.LocalDate;

public interface GoOut {
    double getCost();
    void setCost(double cost);
    
    String getDescription();
    void setDescription(String description);
    
    LocalDate getDate();
    void setDate(LocalDate date);
}
