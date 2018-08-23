package springmvc;
import models.Course;
import repos.CoursesRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CourseController {
	
	@Autowired
	CoursesRepo repo;
	@RequestMapping(path="/courses", method=RequestMethod.GET)
	public String fetchCourses(Model model){
		
		System.out.println("Controller code invoked..");
		
		// fetch courses from db.. repo
		List<Course> courses = repo.findAllCourses();
		System.out.println(courses + " hi hi ");
		
		model.addAttribute("courses", courses);
		return "courseview";
		
	}
}
