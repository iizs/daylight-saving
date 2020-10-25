package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task051 extends ScheduledTasks {
    public Task051() {
        super("Every 3 hours #1");
    }

    private static final Logger log = LoggerFactory.getLogger(Task051.class);

    @Scheduled(cron = "0 0 */3 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
