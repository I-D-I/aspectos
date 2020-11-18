package es.gincol.aop.aspectos;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {

	//@Pointcut("execution(void es.gincol.aop.aspectos.TargetObject.*(..))") //de una clase
	//@Pointcut("within(es.gincol.aop.aspectos.*)") //de clases de un paquete
	//@Pointcut("within(es.gincol.aop..*)") //de clases de un paquete y sus subpaquetes
	@Pointcut("@annotation(GincolAnnotation)") //con anotaciones
	public void targetObjectMethods() {}
}
