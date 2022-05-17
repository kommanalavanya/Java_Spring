package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	@RequestMapping(value="come",method=RequestMethod.GET)
    public String getMessage(ModelMap map) {
    	map.put("msg1","hello");
    	map.put("msg2", "world");
    	return "welcome";    	
    }
}
