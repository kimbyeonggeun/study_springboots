package com.study.study_springboots.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    // com.study.study_springboots.service.*Service.*(..)
    // * -> 함수의 반환형식 / com.stu... -> 폴더 / *Service -> Service로 끝나는 파일 / *(..) ->
    // 파일안의 모든 함수 / (..) -> 파라미터
    @Before(value = "execution(* com.study.study_springboots.service.*Service.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Entering " + joinPoint.getTarget().getClass().getSimpleName()
                + "'s" + joinPoint.getSignature().getName()); // class name and method name
        Object[] args = joinPoint.getArgs(); // params
        for (int i = 0; i < args.length; i++) {
            logger.info("LoggingAspect args[" + i + "] --> " + args[i]);
        }
    }
}
