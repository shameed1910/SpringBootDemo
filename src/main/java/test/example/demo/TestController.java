package test.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
@EnableAutoConfiguration
public class TestController
{
	@GetMapping("/{message}")
	public String test(@PathVariable("message") final String message)
	{
		System.out.println(message);
		return message;

	}

}
