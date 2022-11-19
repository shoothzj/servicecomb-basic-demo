package com.github.shoothzj.servicecomb.demo.api.module;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hezhangjian
 */
@Slf4j
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        long l1 = 400L * 1024L * 1024L * 1024L;
        long l2 = 429496725504L;
        System.out.println(l1 - l2);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}
