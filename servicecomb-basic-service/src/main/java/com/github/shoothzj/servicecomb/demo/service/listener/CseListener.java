package com.github.shoothzj.servicecomb.demo.service.listener;

import com.github.shoothzj.servicecomb.demo.service.util.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.servicecomb.core.BootListener;
import org.apache.servicecomb.serviceregistry.RegistryUtils;
import org.springframework.stereotype.Service;

import java.rmi.registry.Registry;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author hezhangjian
 */
@Slf4j
@Service
public class CseListener implements BootListener {

    public static final CountDownLatch latch = new CountDownLatch(1);

    @Override
    public void onBootEvent(BootEvent bootEvent) {
        final EventType eventType = bootEvent.getEventType();
        if (eventType.equals(EventType.AFTER_REGISTRY)) {
            log.info("event type is [{}]", eventType);
            CommonUtil.sleep(TimeUnit.MINUTES, 5);
        }
    }

}
