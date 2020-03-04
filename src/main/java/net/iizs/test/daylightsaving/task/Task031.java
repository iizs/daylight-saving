package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task031 extends ScheduledTasks {
    public Task031() {
        super("Every 1 day #1");
    }

    private static final Logger log = LoggerFactory.getLogger(Task031.class);

    @Scheduled(cron = "0 0 2 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
