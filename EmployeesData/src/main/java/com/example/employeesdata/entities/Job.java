package com.example.employeesdata.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="jobs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="job_title")
    private String job_title;
    @Column(name="min_salary")
    private int min_salary;
    @Column(name="max_salary")
    private int max_salary;

    @OneToMany
    List<Employee> employeeList;
}