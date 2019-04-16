package io.springbootstarter.hello;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.springbootstarter.topic.RentItRepository;
import io.springbootstarter.topic.Request;
import rentIt.Spring.BO.RegisterUserBO;
import rentIt.Spring.DAO.RegisterUserDAO;

@RestController
public class RentItController {
	//@Autowired
	//RegisterUserBO obj;
	//@Autowired
	RegisterUserDAO objDAO;
	@Autowired
	RentItRepository rentitRepo;
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.POST, value="/registerUser")
	//@PostMapping(path="/registerUser", consumes = "application/json", produces = "application/json")
	public String registerUser(@RequestBody RegisterUserBO obj, HttpServletResponse response)
	{
		System.out.println(obj.getMobileNumber());
		System.out.println(obj.getEmailId());
		System.out.println(obj.getPincode());
		System.out.println(obj.getUserName());
		String isRegistered = "";
		RegisterUserBO registerObj = rentitRepo.save(obj);
		if(null!=registerObj && !registerObj.equals("")) {
			isRegistered="Registered Successfully";
		}else {
			isRegistered="Register Failed";
		}

		return isRegistered;
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.POST,value="/validateLogin")
	public String validateLogin(@RequestBody Request req)
	{
		String str ="";
		System.out.println(req.getLogin());
		System.out.println(req.getPassword());
		List<RegisterUserBO> regObj = (List<RegisterUserBO>) rentitRepo.findAll();
		for (RegisterUserBO dbData : regObj) {
			if(dbData.getMobileNumber().equals(req.getLogin())){
				 str = "Login Successful";
			}
			
		}
		if(!str.equals("Login Successful")) {
			str = "Login Failure";
		}
		return str;
	}
	/* @RequestMapping("/")
	    public String home() {
	        return "Hello Docker World";
	    }*/
}
