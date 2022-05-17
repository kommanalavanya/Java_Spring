package ai.jobiak.jdbcmvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


	@Controller
	public class JdbcController {
		SignupDAO signup;
		
		public JdbcController(SignupDAO signup) {
			this.signup = signup;
			
		}
		

		@RequestMapping(value="sign",method=RequestMethod.POST)
          
		
		public String doSignup(User user,ModelMap map) 
		{
			System.out.println(user.getBalance());
			signup.insertRow(user.getId(),user.getTitle(),user.getBalance());
			map.put("id", user.getId());
			map.put("Title", user.getTitle());
			map.put("balance",user.getBalance());
			return "show";
		}
}
