package com.kurdestan.chaosmonkey.application;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "companys")
@Data

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="foo_sequence")
    @SequenceGenerator(name="foo_sequence", sequenceName = "foo_id_seq", allocationSize = 100)
    private Long id;

    @NotNull
    @Column(name = "name",nullable = false)
    private String name;



    @NotNull
    @Column(name = "email",nullable = false)
    private String email;


    @Version
  private   int version=0;

}
