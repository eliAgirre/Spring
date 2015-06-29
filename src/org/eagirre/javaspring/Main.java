package org.eagirre.javaspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.beans.factory.xml.*;


public class Main {
	
	/**
	 * A class to draw shapes.
	 */

	public static void main(String[] args) {
		
		// Instance a Triangle class
		//Triangle triangle = new Triangle();
		
		// Instance BeanFactory to use spring.xml file.
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		// Instance ApplicationContext to use spring.xml file. (Interfaz)
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		// Pass the id of the class Triangle
		//factory.getBean("triangle");
		
		// Instance a Triangle class passing the id of file xml casting it
		// Se instancia la clase Triangle pasando el id (con el cast Triangle)
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		// Call to draw method
		triangle.draw();

	}

}
