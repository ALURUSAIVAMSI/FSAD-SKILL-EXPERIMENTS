package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

    @Id
    private int orderId;

    private String name;
    private String date;
    private String status;
    private double amount;

    // getters and setters
}