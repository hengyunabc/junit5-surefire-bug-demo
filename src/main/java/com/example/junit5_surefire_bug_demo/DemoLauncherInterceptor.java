package com.example.junit5_surefire_bug_demo;

import org.junit.platform.launcher.LauncherInterceptor;

public class DemoLauncherInterceptor implements LauncherInterceptor{
	@Override
	public <T> T intercept(Invocation<T> invocation) {
		System.err.println("DemoLauncherInterceptor");
		return invocation.proceed();
	}

	@Override
	public void close() {
		// do nothing
	}
}
