package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task052 extends ScheduledTasks {
    public Task052() {
        super("Every 3 hours #2");
    }

    private static final Logger log = LoggerFactory.getLogger(Task052.class);

    @Scheduled(cron = "0 30 */3 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
