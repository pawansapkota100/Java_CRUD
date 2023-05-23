package com.sameer.dbtest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address_data")
public class Address {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length=20, name="address_state")
    private String state;
    @Column(length=20, name="address_district")
    private String district;
}
