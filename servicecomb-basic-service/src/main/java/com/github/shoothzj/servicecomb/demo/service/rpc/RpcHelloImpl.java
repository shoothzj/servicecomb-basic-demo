package com.github.shoothzj.servicecomb.demo.service.rpc;

import com.github.shoothzj.servicecomb.demo.api.IHello;
import com.github.shoothzj.servicecomb.demo.api.module.Person;
import com.github.shoothzj.servicecomb.demo.api.module.ValidationDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.servicecomb.provider.pojo.RpcSchema;

import javax.validation.Valid;
import java.util.concurrent.TimeUnit;

/**
 * @author hezhangjian
 */
@Slf4j
@RpcSchema(schemaId = "hello")
public class RpcHelloImpl implements IHello {

    @Override
    public String sayHi(String name) {
        log.info("say hi, name is {}", name);
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hi";
    }

    @Override
    public String sayHello(Person person) {
        log.info("get person, person is {}", person);
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Person";
    }

    @Override
    public void hello(@Valid ValidationDTO validationDTO) {
        log.info("hello");
    }

}
