package d17cqcp02.n17dccn155.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/form")
	public String formSV()
	{
		
		return "/student/form";
	}
	@RequestMapping("/save")
	public String saveSV(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		String mark = request.getParameter("mark");
		String major = request.getParameter("major");
		
		request.setAttribute("name", name);
		request.setAttribute("mark", mark);
		request.setAttribute("major", major);
		return "/student/success";
	}
}
