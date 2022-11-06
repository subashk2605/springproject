package com.book.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class BookLogger {
	private static final Logger LOG=LoggerFactory.getLogger(BookLogger.class);

	
	@Around("execution(* com.book.service.BookService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable { LOG.info("Before execution args:{} {}", joinPoint.getArgs(), joinPoint.getSignature());
	Object o = joinPoint.proceed();
	LOG.info("After execution");
	return o;
	
}

//
//	@Around("execution(* com.example.aop.demoaop.CalcService.*(..))")
//	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable { LOG.info("Before execution args:{} {}", joinPoint.getArgs(), joinPoint.getSignature());
//		Object o = joinPoint.proceed();
//		LOG.info("After execution");
//		return o;
//	}
//
//}

}
