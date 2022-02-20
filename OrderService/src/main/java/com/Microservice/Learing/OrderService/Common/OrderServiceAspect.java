package com.Microservice.Learing.OrderService.Common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class OrderServiceAspect {
	
	 private Logger logger = LoggerFactory.getLogger(this.getClass());

	    @AfterReturning(value = "execution(* com.Microservice.Learing.OrderService.Controller.*.*(..))",
	        returning = "result")
	    public void afterReturning(JoinPoint joinPoint, Object result) {
	        logger.info("{} returned with value {}", joinPoint, result);
	    }

	   
}
