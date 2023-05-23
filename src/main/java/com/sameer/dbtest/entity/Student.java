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
@Table(name="student_data")
public class Student {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length=20, name="student_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="address_id", referencedColumnName = "id",
    foreignKey = @ForeignKey(name = "FK_STUDENT_ADDRESS"))
    private Address address;

}
