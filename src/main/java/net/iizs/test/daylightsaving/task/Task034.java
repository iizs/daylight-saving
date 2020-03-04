package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task034 extends ScheduledTasks {
    public Task034() {
        super("Every 1 day #4");
    }

    private static final Logger log = LoggerFactory.getLogger(Task034.class);

    @Scheduled(cron = "0 30 3 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
