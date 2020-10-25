package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task055 extends ScheduledTasks {
    public Task055() {
        super("Every 3 hours #5");
    }

    private static final Logger log = LoggerFactory.getLogger(Task055.class);

    @Scheduled(cron = "0 0 2-23/3 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
