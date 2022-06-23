package io.ohmry.dddjpaexample.project;

import io.ohmry.dddjpaexample.core.annotations.Domain;

import javax.persistence.*;

@Domain
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    ProjectScheduler scheduler;

}
