package com.sc.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {
	@Pointcut("execution(* com.sc.controller.Co.*(..))")
	private void add(){};
	
	
	@Before("add()")
   public void add2(JoinPoint joinPoint) {
	   
	   System.out.println(joinPoint.getTarget());
	   
	   
	   System.out.println("你好");
	   
   };
	
	
	
	
	
}
