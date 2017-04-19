package cn.com.strongunion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemo1Application.class, args);
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int count(int count) {
		return count ++ ;
	}
}
