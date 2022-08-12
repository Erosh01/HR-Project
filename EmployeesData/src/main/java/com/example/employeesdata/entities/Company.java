package com.example.employeesdata.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="companies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="street")
    private String street;
    @Column(name="postal")
    private String postal;
    @Column(name="city")
    private String city;
    @Column(name="province")
    private String province;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City country;

    @OneToMany
    private List<Department> departments;



}

