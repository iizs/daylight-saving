package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task024 extends ScheduledTasks {
    public Task024() {
        super("Every 2 hours #4");
    }

    private static final Logger log = LoggerFactory.getLogger(Task024.class);

    @Scheduled(cron = "0 30 1-23/2 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
