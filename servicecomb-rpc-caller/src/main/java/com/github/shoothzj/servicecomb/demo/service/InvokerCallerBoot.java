package com.github.shoothzj.servicecomb.demo.service;

import com.github.shoothzj.servicecomb.demo.api.module.Person;
import lombok.extern.slf4j.Slf4j;
import org.apache.servicecomb.core.provider.consumer.InvokerUtils;
import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author hezhangjian
 */
@Slf4j
@Component
public class InvokerCallerBoot {

    private static final String serviceName = "APP1:provider";

    public static void main(String[] args) {
        BeanUtils.init();
        Person person = new Person();
        HashMap<String, Object> map = new HashMap<>();
        map.put("person", person);
        Object o = InvokerUtils.syncInvoke(serviceName, "hello", "sayHello", map);
        log.info("result is {}", o);
    }

}
