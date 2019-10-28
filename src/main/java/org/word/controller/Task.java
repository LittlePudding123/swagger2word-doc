package org.word.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.Random;

/** 
* @FileName Task.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年2月24日 下午2:48:47 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@Controller
public class Task {

	public static Random random =new Random();
	
	@Async
	public void taskOne() throws Exception {
		System.out.println("开始执行任务一");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end=System.currentTimeMillis();
		System.out.println("任务一执行时间："+(end- start));
	}
	
	@Async
	public void taskTwo() throws Exception {
		System.out.println("开始执行任务二");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end=System.currentTimeMillis();
		System.out.println("任务二执行时间："+(end- start));
	}

	@Async
	public void taskThree() throws Exception {
		System.out.println("开始执行任务三");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end=System.currentTimeMillis();
		System.out.println("任务三执行时间："+(end- start));
	}
}