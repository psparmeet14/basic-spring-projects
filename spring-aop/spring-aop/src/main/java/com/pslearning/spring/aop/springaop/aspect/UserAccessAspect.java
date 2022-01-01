package com.pslearning.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
	
	/* Terminologies:
	 * 
	 * PointCut: The expression which defines what kind of methods I'd want to intercept
	 * 
	 * Advice: What should I do when I do the interception. 
	 * When interception a method call what should I do. The logic is the advice
	 * 
	 * Aspect: The combination of PointCut and Advice is called an Aspect.
	 * 
	 * JoinPoint: Specific interception of a method call. Specific execution interception.
	 * 
	 * Weaving: The process where whole thing gets weaved around code is called weaving.
	 * The Spring AOP framework ensuring things gets executed at the right moment.
	 * 
	 * Weaver: Framework that implements AOP.
	 */
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method calls I want to intercept
	// execution(* PACKAGE.*.*(..))
	// The expression below is the pointcut
	@Before("com.pslearning.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {
		// Advice
		logger.info("Check for user access");
		logger.info("Allowed execution for {}", joinPoint);
	}
}
