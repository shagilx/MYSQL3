package com.shagil.siddiqui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication

public class MysqlApplication implements CommandLineRunner{
	static final String[] questions={
			"What is the size of wchar_t in C++?","Pick the odd one out","Which datatype is used to represent the absence of parameters?",
			"What does a escape code represent?","Which type is best suited to represent the logical values?","Identify the user-defined types from the following?",
			"Which of the following statements are true?\n" + "    int f(float)","The value 132.54 can represented using which data type?",
			"When a language has the capability to produce new data type mean, it can be called as"};
	static final String[] option1={"2","array type","int","alert","integer","f is a function taking an argument of type int and retruning a floating point number",
			"double","overloaded","integer, character, boolean, floating"};
	static final String[] option2={"4","character type","short","backslash","boolean","f is a function taking an argument of type float and returning a integer.",
			"void","extensible","enumeration, classes"};
	static final String[] option3={"2 or 4","boolean type","void","tab","character","f is a function of type float","int","encapsulated","integer, enum, void"};
	static final String[] option4={"based on the number of bits in the system","integer type","float","form feed","all of the above","none of the mentioned","bool","reprehensible","arrays, pointer, classes"};
	static final int[] correctAnswer={4,1,3,1,2,3,2,1,2};
	public static final String[] skills={"C","C++","Python","Java"};
	public static final String[] levels={"Beginner","Medium","Advanced","Professional"};
	@Autowired
	QuestionRepository questionRepository;
	@Autowired
	OptionsRepository optionsRepository;

	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		/*HashSet optionsHashSet=new HashSet();
		optionsHashSet.add(new Options(1,option1[0],false));
		optionsHashSet.add(new Options(1,option2[0],false));
		optionsHashSet.add(new Options(1,option3[0],false));
		optionsHashSet.add(new Options(1,option4[0],true));
		optionsRepository.save(optionsHashSet);*/


	}
}
