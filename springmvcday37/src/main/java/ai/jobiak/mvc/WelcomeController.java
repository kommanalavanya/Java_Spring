package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
@RequestMapping(value="come",method=RequestMethod.GET)

public String message(ModelMap map) {
	map.put("msg1", "Welcome to Spring mvc Programming");
	map.put("msg2", "Spring for limitless options");
	map.put("tonguetwister", "she sells sea shells on the sea shore");
	return "welcome";
}

}
