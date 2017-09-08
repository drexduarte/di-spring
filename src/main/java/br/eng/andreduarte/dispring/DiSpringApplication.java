package br.eng.andreduarte.dispring;

import br.eng.andreduarte.dispring.controllers.ConstructorInjectedController;
import br.eng.andreduarte.dispring.controllers.MyController;
import br.eng.andreduarte.dispring.controllers.PropertyInjectedController;
import br.eng.andreduarte.dispring.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
