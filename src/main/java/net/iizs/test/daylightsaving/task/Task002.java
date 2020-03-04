package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task002 extends ScheduledTasks {
    public Task002() {
        super("Every 10 minutes #2");
    }

    private static final Logger log = LoggerFactory.getLogger(Task002.class);

    @Scheduled(cron = "0 5-55/10 * * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
