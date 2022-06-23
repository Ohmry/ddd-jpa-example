package io.ohmry.dddjpaexample.project;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class ProjectScheduler {
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
}
