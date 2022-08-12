package com.example.employeesdata.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @Column(name = "id", nullable = false)
    private Long employeeId;

    @Column(name= "first_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column(name= "email")
    private String email;

    @Column(name= "phone_number")
    private String phone_number;

    @Column(name= "hire_date")
    private Date hire_date;

    @Column(name= "salary")
    private int salary;

    @Column(name= "comission_pct")
    private int comission_pct;

    @ManyToOne
    @JoinColumn(name = "job_id",referencedColumnName = "id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "manager_id")
    private Employee managerId;

    @OneToOne
    private JobHistory jobHistory;

}
