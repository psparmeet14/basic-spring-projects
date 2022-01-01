package com.pslearning.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("com.pslearning.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTime()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		
		Object retValue = joinPoint.proceed();
		
		long timeTaken = System.currentTimeMillis() - startTime;
		
		logger.info("Time taken by {} is {}", joinPoint, timeTaken);
		
		return retValue;
	}
	
}
