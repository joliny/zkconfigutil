package com.jerry.zkconfigutil;

import com.jerry.zkconfigutil.app.ZkConfigUtil;
import com.jerry.zkconfigutil.app.ZkConfigUtilFactory;
import com.jerry.zkconfigutil.exception.NotRegistedException;

/**
 * not JUNIT
 * @author JERRY
 *
 */
public final class TestZkConfigUtil {

	public static void main(String[] args) throws InterruptedException,
			InstantiationException, IllegalAccessException,
			NotRegistedException {
		
		ZkConfigUtil app = ZkConfigUtilFactory.getZkConfigUtil("localhost:2181");
		app.register(Demo.class, true);
		
		while (true) {
			loop();
		}
	}

	public static void loop() throws InterruptedException {
		Thread.sleep(2000L);
	}

}
