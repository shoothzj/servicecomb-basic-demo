package com.github.shoothzj.servicecomb.demo.service;

import com.github.shoothzj.servicecomb.demo.api.module.Person;
import lombok.extern.slf4j.Slf4j;
import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author hezhangjian
 */
@Slf4j
@Component
public class RestTemplateCallerBoot {

    public static void main(String[] args) {
        BeanUtils.init();
        Person person = new Person();
        RestTemplate restTemplate = RestTemplateBuilder.create();
        ResponseEntity<String> o = restTemplate.postForEntity("cse://APP1:provider/RpcHelloImpl/sayHello",
                person, String.class);
        log.info("result is {}", o);
    }

}
