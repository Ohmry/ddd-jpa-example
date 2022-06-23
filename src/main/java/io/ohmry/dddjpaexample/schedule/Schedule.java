package io.ohmry.dddjpaexample.schedule;

import io.ohmry.dddjpaexample.core.annotations.Domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Domain
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column
    private String description;
    @Column
    private LocalDateTime startDate;
    @Column
    private LocalDateTime endDate;
    @Column
    private Progress progress;
}
