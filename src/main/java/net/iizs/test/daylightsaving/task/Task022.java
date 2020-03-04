package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task022 extends ScheduledTasks {
    public Task022() {
        super("Every 2 hours #2");
    }

    private static final Logger log = LoggerFactory.getLogger(Task022.class);

    @Scheduled(cron = "0 30 */2 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
