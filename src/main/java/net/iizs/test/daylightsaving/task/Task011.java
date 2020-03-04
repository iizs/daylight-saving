package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task011 extends ScheduledTasks {
    public Task011() {
        super("Every 1 hour #1");
    }

    private static final Logger log = LoggerFactory.getLogger(Task011.class);

    @Scheduled(cron = "0 0 * * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
