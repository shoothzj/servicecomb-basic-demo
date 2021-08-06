package com.github.shoothzj.servicecomb.demo.api.module;

import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;

/**
 * @author hezhangjian
 */
@Slf4j
@Valid
public class ValidationDTO {

    @javax.validation.constraints.Null
    private String name;

}
