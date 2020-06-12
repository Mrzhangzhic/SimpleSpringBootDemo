package com.example.zhangzhic.zzc.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;


@org.aspectj.lang.annotation.Aspect
@Configuration
public class Aspect {


    /**
     * @Pointcut注解，这是一个切入点定义
     * execution中第一个*表示方法返回任意值，第二个*表示service包下的任意类，第三个*表示类中的任意方法，括号中的两个点表示方法参数任意
     * 这里描述的切入点为service包下所有类中所有方法
     */
    @Pointcut("execution(* com.example.zhangzhic.zzc.controller.*.*(..))")
    public void pel() {
    }

    /**
     * 前置通知，方法执行前执行
     * @param joinPoint
     */
    @Before(value = "pel()")
    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法开始执行...");
    }

    /**
     * 后置通知，方法执行后执行
     * @param joinPoint
     */
    @After(value = "pel()")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法执行结束...");
    }

    /**
     * 返回通知
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "pel()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法返回值为：" + result);
    }

    /**
     * 异常通知
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "pel()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法抛异常了，异常是：" + e.getMessage());
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around("pel()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return proceedingJoinPoint.proceed();
    }
}
