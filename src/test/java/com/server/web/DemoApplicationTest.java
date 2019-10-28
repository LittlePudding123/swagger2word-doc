package com.server.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.word.controller.Task;

/**
 * Created by 豆腐干Sama on 2018/11/16.
 * 
 */
@RunWith(SpringRunner.class)
@ContextConfiguration
public class DemoApplicationTest {

    @Autowired
    public Task taskTest;

    public DemoApplicationTest(Task taskTest) {
        this.taskTest = taskTest;
    }

    @Test
    public void test() throws Exception {
        System.out.println("111111111");
        taskTest.taskOne();
        System.out.println("2222222222222");
        taskTest.taskTwo();
        taskTest.taskThree();
        System.out.println("3333333333333");

    }
}
