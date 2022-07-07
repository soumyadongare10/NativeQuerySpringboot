package com.example.demo4nativequeryspringboot.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer emp_id;
    private  String fname;
    private  String lname;
    private  Integer age;
    private  Integer salary;
    private  String dept_name;
    private  Float price;


}
