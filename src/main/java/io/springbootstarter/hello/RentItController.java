package io.springbootstarter.hello;

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
	
		rentitRepo.save(obj);

		return "success Post";
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value="/hello",  produces = "application/json")
	public String sayHi()
	{
		Request req= new Request();
		ObjectMapper mapper = new ObjectMapper();
		req.setPlace("a");
		req.setDate("b");
		req.setTime("c");
		System.out.println("inside hello");
		String jsonInString=null;
		try {
			jsonInString = mapper.writeValueAsString(req);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("'"+jsonInString+"'");
		return jsonInString;
	}
	/* @RequestMapping("/")
	    public String home() {
	        return "Hello Docker World";
	    }*/
}
