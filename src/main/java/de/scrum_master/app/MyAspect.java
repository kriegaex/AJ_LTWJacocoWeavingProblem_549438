package de.scrum_master.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
  @Before("execution(* *(..)) && !within(MyAspect)")
  public void myAdvice(JoinPoint joinPoint) {
    System.out.println(joinPoint);
  }
}
