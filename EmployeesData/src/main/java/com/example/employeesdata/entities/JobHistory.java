package com.example.employeesdata.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="job_history")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobHistory
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long job_history_id;

    @OneToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department_id;

    @Temporal(TemporalType.DATE)
    @Column(name="start_date")
    @Type(type="date")
    private Date start_date;

    @Temporal(TemporalType.DATE)
    @Column(name="end_date")
    @Type(type="date")
    private Date end_date;


}
