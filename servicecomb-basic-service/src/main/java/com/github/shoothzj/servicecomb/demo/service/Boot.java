package com.github.shoothzj.servicecomb.demo.service;

import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hezhangjian
 */
@SpringBootApplication
public class Boot {

    public static void main(String[] args) {
        BeanUtils.init();
    }

}
