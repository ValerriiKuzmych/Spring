package beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main (String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SimpleBean userValerii = context.getBean("valeriiKuzmych", SimpleBean.class);
		
		
		System.out.println(userValerii);
		
		context.close();
	}

}
