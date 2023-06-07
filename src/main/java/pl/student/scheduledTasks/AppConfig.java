package pl.student.scheduledTasks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
@Slf4j
public class AppConfig {

    private int i = 0;

    // initialDelay - task will first start after 10 seconds
    // fixedDelay - task will run and finish, after 1000 ms delay it will restart
    // you can also use CRON, delays can be variables in application.properties
    // can be configured in xml also
    @Scheduled(fixedDelay = 1000, initialDelay = 10000)
    private void sayFooDelay() {
        i++;
        log.info("foo {}", i);
    }

    // fixedRate - task will run, after 1000 ms from starting it will try to run again
    // will not run if async is disabled and same task is currently running
    @Scheduled(fixedRate =1000)
    private void sayFooRate() {
        i++;
        log.info("foo {}", i);
    }

}
