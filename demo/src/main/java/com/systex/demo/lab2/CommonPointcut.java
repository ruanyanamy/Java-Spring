package com.systex.demo.lab2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {
	
	@Pointcut("execution(* com.systex.demo.model.Product.*(..))")
	public void abc() {};
	
}
