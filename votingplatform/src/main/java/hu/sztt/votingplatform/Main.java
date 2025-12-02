package hu.sztt.votingplatform;

import hu.sztt.votingplatform.data.JSONHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		//SpringApplication.run(Main.class, args);
		JSONHandler a = new JSONHandler();
	}

}
