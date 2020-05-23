package com.eva.eva.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Table(name = "university")
@Entity
public class University {

    private String city;

    @Id
    @GeneratedValue
    @Column(name = "university_id")
    private int id;

    @Column(name = "domain")
    private String domain;
}
