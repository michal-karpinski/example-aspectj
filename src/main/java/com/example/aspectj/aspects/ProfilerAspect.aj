package com.example.aspectj.aspects;

public aspect ProfilerAspect {
	
	Object around(): execution(* com.example.aspectj.*.*(..)) {
		long timeStart = System.currentTimeMillis();
		
		try {
			return proceed();
			
		} finally {
			String methodName = thisJoinPoint.getSignature().getName();
			long measuredTime = System.currentTimeMillis() - timeStart;
			
			System.out.println(methodName + ": " + measuredTime + "ms");
		}
	}
}
