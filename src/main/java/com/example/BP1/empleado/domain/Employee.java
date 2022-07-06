package com.example.BP1.empleado.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employeeid")
    private String employeeId;

    @Column(name="employeename")
    private String employeeName;

    @Column(name="employeeaddress")
    private String employeeAddress;

    @Column(name = "employeeemail")
    private String employeeEmail;
}
