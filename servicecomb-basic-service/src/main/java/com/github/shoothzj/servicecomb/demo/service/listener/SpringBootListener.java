package com.github.shoothzj.servicecomb.demo.service.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

/**
 * @author hezhangjian
 */
@Slf4j
@Service
public class SpringBootListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("springboot application ready {}", event);
        CseListener.latch.countDown();
    }
}
