package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task053 extends ScheduledTasks {
    public Task053() {
        super("Every 3 hours #3");
    }

    private static final Logger log = LoggerFactory.getLogger(Task053.class);

    @Scheduled(cron = "0 0 1-23/3 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
