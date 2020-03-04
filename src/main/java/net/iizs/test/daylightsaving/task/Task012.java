package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task012 extends ScheduledTasks {
    public Task012() {
        super("Every 1 hour #2");
    }

    private static final Logger log = LoggerFactory.getLogger(Task012.class);

    @Scheduled(cron = "0 30 * * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
