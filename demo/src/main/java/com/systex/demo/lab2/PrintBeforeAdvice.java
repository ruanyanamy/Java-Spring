package com.systex.demo.lab2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintBeforeAdvice {

	//@Before("execution(* com.systex.demo.model.Product.*(..))") //com前面要有空格,Product.後面不能有空格
	//@Before("com.systex.demo.lab2.CommonPointcut.abc()")
	//@Around("com.systex.demo.lab2.CommonPointcut.abc()")
	//@Around("execution(Protected com.systex.demo.model.Product.*(..))")
	//@Around("within(com.systex.demo.model.Product)")
	//@Around("target(com.systex.demo.model.Product)")
	@Around("this(com.systex.demo.model.Product)")
	public Object before(ProceedingJoinPoint joinpoint) {   //JoinPoint改成ProceedingJoinPoint底下的程式碼都不用改,因為ProceedingJoinPoint是JoinPoint的subclass
		long start = System.nanoTime();
		Object obj = null;
		System.out.println("this is PrintBeforeAdvice加入的訊息"+
				joinpoint.getSignature().getDeclaringTypeName()+","+
				joinpoint.getSignature().getName());
		
		try {
			obj = joinpoint.proceed(); //把控制權還給container
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		System.out.println("Total Process Time = "+(end - start)+"ns.");
		
		return obj;
	}
	
//	//@Before("execution(* com.systex.demo.model.Product.*(..))") //com前面要有空格,Product.後面不能有空格
//		//@Before("com.systex.demo.lab2.CommonPointcut.abc()")
//		@Around("com.systex.demo.lab2.CommonPointcut.abc()")
//		public void before( JoinPoint joinpoint) {  
//			//JoinPoint改成ProceedingJoinPoint底下的程式碼都不用改,因為ProceedingJoinPoint是JoinPoint的subclass
//			System.out.println("this is PrintBeforeAdvice加入的訊息"+
//					joinpoint.getSignature().getDeclaringTypeName()+","+
//					joinpoint.getSignature().getName());
//		}
	
}
