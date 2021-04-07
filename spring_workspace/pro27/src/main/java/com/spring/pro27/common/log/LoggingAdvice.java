package com.spring.pro27.common.log;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
	private static final Logger logger = LoggerFactory.getLogger(LoggingAdvice.class);
	
	@AfterReturning("execution(* com.spring.pro27.member.service.*.*(..)) or "
			+ "execution(* com.spring.pro27.member.dao.*.*(..))")

	public void startLog(JoinPoint jp) {

		logger.info("-------------------------------------");
		logger.info("-------------------------------------");

		// 전달되는 모든 파라미터들을 Object의 배열로 가져옵니다. 
		logger.info("1:" + Arrays.toString(jp.getArgs()));

		// 해당 Advice의 타입을 알아냅니다. 
		logger.info("2:" + jp.getKind());

		// 실행하는 대상 객체의 메소드에 대한 정보를 알아낼 때 사용합니다. 
		logger.info("3:" + jp.getSignature().getName());

		// target 객체를 알아낼 때 사용합니다. 
		logger.info("4:" + jp.getTarget().toString());

		// Advice를 행하는 객체를 알아낼 때 사용합니다. 
		logger.info("5:" + jp.getThis().toString());

	}
	
	@Around("execution(* com.spring.pro27.member.service.*.*(..)) or "
			+ "execution(* com.spring.pro27.member.dao.*.*(..))")
	public Object timelog(ProceedingJoinPoint pjp)throws Throwable {
			long startTime = System.currentTimeMillis();
			//메서드 실행 시간
			logger.info(Arrays.toString(pjp.getArgs()));
			
			Object result = pjp.proceed();
			long endTime= System.currentTimeMillis();
			//메서드 종료시간 
			logger.info(pjp.getSignature().getName() +" : "+(endTime-startTime));
			//실제 실행시간.
			logger.info("=======================================================");
			return result;
			//Around 사용시 반드시 Object를 리턴해주어야 한다.
	}
}
