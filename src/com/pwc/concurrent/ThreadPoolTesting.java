package com.pwc.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 10, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));
		//ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 20; i++) {
			
			MyTask task = new MyTask(i);
			
			poolExecutor.execute(task);
            System.out.println("There are ："+poolExecutor.getPoolSize()+" in the Thread pool"+"，There are ："+
            		poolExecutor.getQueue().size()+" in the queue"+"，there are ："+poolExecutor.getCompletedTaskCount()+" finished");
			
			
			
		}

	}

}
