package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task043 extends ScheduledTasks {
    public Task043() {
        super("Designated #3");
    }

    private static final Logger log = LoggerFactory.getLogger(Task043.class);

    @Scheduled(cron = "0 0 2,4,5 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
