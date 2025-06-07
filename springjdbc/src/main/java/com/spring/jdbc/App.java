package com.spring.jdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
public class App 
{
    public static void main( String[] args )
    {
        		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
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
        		Student student = new Student();
        		student.setId(666);
        		student.setName("wick");
        		student.setCity("delhi");
        		
        		int result = studentDao.change(student);
        		
        		System.out.println("data changed " +result);
    }
}
