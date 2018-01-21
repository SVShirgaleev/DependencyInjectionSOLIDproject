package com.sshirgaleev.didemo;

import com.sshirgaleev.didemo.controllers.ConstructorInjectedController;
import com.sshirgaleev.didemo.controllers.GetterInjectedController;
import com.sshirgaleev.didemo.controllers.MyController;
import com.sshirgaleev.didemo.controllers.PropertyInjectedController;
import com.sshirgaleev.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");


		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

	}
}
