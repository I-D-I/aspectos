package es.gincol.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import es.gincol.aop.aspectos.TargetObject;

@SpringBootApplication
public class AspectosApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AspectosApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(AspectosApplication.class, args);
		TargetObject targetBean = context.getBean(TargetObject.class);
		targetBean.hello("hello world");
		targetBean.foo();
	}

}
