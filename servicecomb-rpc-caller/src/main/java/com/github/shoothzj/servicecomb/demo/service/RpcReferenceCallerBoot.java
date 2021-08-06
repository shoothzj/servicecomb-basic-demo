package com.github.shoothzj.servicecomb.demo.service;

import com.github.shoothzj.servicecomb.demo.api.IHello;
import com.github.shoothzj.servicecomb.demo.api.module.Person;
import lombok.extern.slf4j.Slf4j;
import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Component;

/**
 * @author hezhangjian
 */
@Slf4j
@Component
public class RpcReferenceCallerBoot {

    private static final String serviceName = "${USER:0}:provider";

    @RpcReference(microserviceName = serviceName, schemaId = "hello")
    private static IHello iHello;

    public static void main(String[] args) {
        BeanUtils.init();
        Person person = new Person();
        String s = iHello.sayHello(person);
        log.info("result is {}", s);
    }

}
