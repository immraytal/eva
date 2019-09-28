package com.eva.eva.entities;

import com.eva.eva.entities.Vacancy;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@Table(name = "training")
@Entity
public class Training {

    @Id
    @GeneratedValue
    @Column(name = "training_id")
    private int id;

    @JoinColumn
    private ArrayList<Vacancy> vacancys;
}
