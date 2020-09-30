package d17cqcp02.n17dccn155.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class WelcomeController {
	@RequestMapping("welcome")
	public String viewWelcome()
	{
		return "welcome";
	}
	@RequestMapping(value="welcome",method=RequestMethod.POST)
	public String redirectWelcome()
	{
		return "redirect:student/form";
	}
}
