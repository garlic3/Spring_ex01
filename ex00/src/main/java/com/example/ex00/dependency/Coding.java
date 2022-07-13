package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coding {
	
	// 필드 주입 
	// 굉장히 편하게 주입할 수 있으니 순환 참조(무한루프)시 오류가 발생하지 않기 때문에 StackOverFlow 발생
	
	@Autowired
	Computer computer;

}
