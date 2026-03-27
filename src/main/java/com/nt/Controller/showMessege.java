package com.nt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showMessege {
	@RequestMapping("/home")
	public String Message() {
		return "Welcome";
		//BootMVCProj01-FirstApp/src/main/web app/WEB-INF/pages/Welcome.jsp
	}

}
