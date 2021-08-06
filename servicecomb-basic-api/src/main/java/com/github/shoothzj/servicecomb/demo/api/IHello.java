package com.github.shoothzj.servicecomb.demo.api;

import com.github.shoothzj.servicecomb.demo.api.module.Person;
import com.github.shoothzj.servicecomb.demo.api.module.ValidationDTO;

import javax.validation.Valid;

/**
 * @author hezhangjian
 */
public interface IHello {

    String sayHi(String name);

    String sayHello(Person person);

    void hello(@Valid ValidationDTO validationDTO);

}
