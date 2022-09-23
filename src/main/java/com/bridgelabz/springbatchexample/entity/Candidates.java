package com.bridgelabz.springbatchexample.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table
@Entity
public class Candidates {
    @Id
    private Long id;
    private Long mandatorId;
    private String parentSenderrefId;
}
