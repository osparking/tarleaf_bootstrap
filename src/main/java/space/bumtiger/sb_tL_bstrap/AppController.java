package space.bumtiger.sb_tL_bstrap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AppController {
	@GetMapping("/") 
	public String showHomepage(Model model) {
		model.addAttribute("greeting", "안녕하세요? 어서오세요!");
		return "homepage";
	}
	
}
