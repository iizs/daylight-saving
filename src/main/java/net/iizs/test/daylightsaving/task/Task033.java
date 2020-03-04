package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task033 extends ScheduledTasks {
    public Task033() {
        super("Every 1 day #3");
    }

    private static final Logger log = LoggerFactory.getLogger(Task033.class);

    @Scheduled(cron = "0 0 3 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
