package com.eva.eva.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "branch")
public class Branch{

    @Id
    @GeneratedValue
    @Getter
    @Setter
    @Column(name = "branch_id")
    private int id;

    @Getter
    @Setter
    private Company companyId;

    @Getter
    @Setter
    private String city;


}
