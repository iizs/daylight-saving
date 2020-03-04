package net.iizs.test.daylightsaving;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public abstract class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEE MMM d HH:mm:ss VV yyyy");

    private String id;

    public ScheduledTasks(String id) {
        this.id = id;
    }

    protected String getLogMessage() {
        return dateFormat.format(ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("America/Los_Angeles"))) + " | "
                + dateFormat.format(ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"))) + " | "
                + id;
    }

    /*
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"))));
        log.info("The time is now {}", dateFormat.format(ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("America/Los_Angeles"))));
    }*/
}
