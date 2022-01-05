package de.scrum_master.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
  @Before(
    "execution(* *(..)) && !within(MyAspect)"
      + " && !execution(* *..$jacoco*(..))"
      //+ " && within(de.scrum_master..*)"
  )
  public void myAdvice(JoinPoint joinPoint) {
    System.out.println(joinPoint);
  }
}
