package com.pslearning.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.pslearning.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("execution(* com.pslearning.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("com.pslearning.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() && com.pslearning.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void allLayersExecution() {}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {}
	
	@Pointcut("within(com.pslearning.spring.aop.springaop.business..*)")
	public void withinBusinessLayer() {}
	
	@Pointcut("@annotation(com.pslearning.spring.aop.springaop.aspect.TrackTime)")
	public void trackTime() {}
}
