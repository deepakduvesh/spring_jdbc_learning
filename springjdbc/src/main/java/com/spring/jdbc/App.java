package com.spring.jdbc;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
public class App 
{
    public static void main( String[] args )
    {
    			ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
//        		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        		
        		//insert query
//        		String query = "insert into student(id, name, city) values(?, ?, ?)";
        		
        		//fire query
//        		int result = template.update(query, 16, "Mohan", "haryana");
        		
        		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        		
//        		Student student = new Student();
//        		student.setId(666);
//        		student.setName("john");
//        		student.setCity("lucknow");
//        		
//        		int result = studentDao.insert(student);
        		
        		
        		//update
//        		Student student = new Student();
//        		student.setId(666);
//        		student.setName("wick");
//        		student.setCity("delhi");
//        		
//        		int result = studentDao.change(student);
//        		
//        		System.out.println("data changed " +result);
        		
        		//delete
//        		int result = studentDao.delete(666);
//        		
//        		System.out.println("deleted " +result);
        		
        		//select single data
//        		Student student = studentDao.getStudent(13);
//        		System.out.println(student);
        		
        		//select multiple data
        		List<Student> students = studentDao.getAllStudents();
        		for(Student s : students) {
        			System.out.println(s);
        		}
    }
}
