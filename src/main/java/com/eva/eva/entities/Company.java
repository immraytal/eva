package com.eva.eva.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company")
@Entity
public class Company {

    @Id
    @GeneratedValue
    @Column(name = "company_id")
    private int id;

    @Column(name = "company_name")
    private String name;
}
