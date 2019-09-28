package com.eva.eva.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Table(name = "university")
public class University {

    private String city;

    @Id
    @GeneratedValue
    @Column(name = "university_id")
    private int id;

    @Column(name = "domain")
    private String domain;
}
