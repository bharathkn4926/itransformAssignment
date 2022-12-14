package login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController{

	@RequestMapping("/login")
	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception{
		  String userName=request.getParameter("userName");  
	      String password=request.getParameter("password");
	      String message;
	      if(userName != null && 
	    		  !userName.equals("") 
	    		  && userName.equals("Bharath") && 
	    		  password != null && 
	    		  !password.equals("") && 
	    		  password.equals("1309")){
	    	  message = "Welcome " +userName + ".";
		      return new ModelAndView("welcome", 
		    		  "message", message);  
	 
	      }else{
	    	  message = "Wrong username or password.";
	    	  return new ModelAndView("errorPage", 
	    			  "message", message);
	      }
	   }

}
