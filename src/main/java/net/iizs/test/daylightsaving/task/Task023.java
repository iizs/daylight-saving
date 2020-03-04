package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task023 extends ScheduledTasks {
    public Task023() {
        super("Every 2 hours #3");
    }

    private static final Logger log = LoggerFactory.getLogger(Task023.class);

    @Scheduled(cron = "0 0 1-23/2 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
