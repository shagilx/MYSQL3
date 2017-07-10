package com.shagil.siddiqui;

import com.shagil.siddiqui.Repository.OptionsRepository;
import com.shagil.siddiqui.Repository.QuestionRepository;
import com.shagil.siddiqui.model.Question;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.transaction.Transactional;

@SpringBootApplication

public class MysqlApplication{
	private static final Logger log= LoggerFactory.getLogger(MysqlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(QuestionRepository repository){
		return (args -> {
			for (Question question:repository.findBySkillAndLevel("C","Beginner")	){
				System.out.println(question.toString());
			}
		});
	}
}
