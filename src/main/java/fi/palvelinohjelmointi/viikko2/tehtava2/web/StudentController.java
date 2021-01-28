package fi.palvelinohjelmointi.viikko2.tehtava2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import fi.palvelinohjelmointi.viikko2.tehtava2.domain.Student;

@Controller
public class StudentController {

	@RequestMapping("/hello")
	public String showStudents(Model model) {
		
		ArrayList<Student> studentList =new ArrayList<>();
		
		studentList.add(new Student("Matti", "Virtanen"));
		studentList.add(new Student("Maija", "Mallikas"));
		studentList.add(new Student("Tiina", "Testi"));
		
		model.addAttribute("students", studentList);
		
		return "students";
	}
	
}
