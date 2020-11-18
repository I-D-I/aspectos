package es.gincol.aop.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyAspect2 {

	private static final Logger log = LoggerFactory.getLogger(MyAspect2.class);

	//@Before("execution(void es.gincol.aop.aspectos.TargetObject.*(..))")
	@Before("PointcutExample.targetObjectMethods()")
	public void before(JoinPoint jointPoint) {
		log.info("Method name: {}",jointPoint.getSignature().getName());
		log.info("Object type: {}",jointPoint.getSignature().getDeclaringTypeName());
		log.info("Modifiers: {}",jointPoint.getSignature().getModifiers());
		log.info("Arguments: {}",jointPoint.getArgs());
		log.info("Before advice");
	}
	
}
