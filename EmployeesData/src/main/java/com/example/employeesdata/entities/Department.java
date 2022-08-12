package com.example.employeesdata.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="departments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="department_name")
    private String department_name;


    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employeeList;
}
