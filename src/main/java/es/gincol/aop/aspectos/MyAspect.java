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
@Order(0)
public class MyAspect {
	
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	//@Before("execution(void es.gincol.aop.aspectos.TargetObject.*(..))")
	@Before("PointcutExample.targetObjectMethods()")
	public void before(JoinPoint jointPoint) {
		log.info("1 Method name: {}",jointPoint.getSignature().getName());
		log.info("1 Object type: {}",jointPoint.getSignature().getDeclaringTypeName());
		log.info("1 Modifiers: {}",jointPoint.getSignature().getModifiers());
		log.info("1 Arguments: {}",jointPoint.getArgs());
		log.info("1 Before advice");
	}

}
