package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task044 extends ScheduledTasks {
    public Task044() {
        super("Designated #4");
    }

    private static final Logger log = LoggerFactory.getLogger(Task044.class);

    @Scheduled(cron = "0 30 2,4,5 * * *")
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
