package net.iizs.test.daylightsaving.task;

import net.iizs.test.daylightsaving.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task001 extends ScheduledTasks {
    public Task001() {
        super("Every 10 minutes #1");
    }

    private static final Logger log = LoggerFactory.getLogger(Task001.class);

    //@Scheduled(cron = "0 */10 * * * *")
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info(getLogMessage());
    }
}
