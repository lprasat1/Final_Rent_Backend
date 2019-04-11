package rentIt.Spring.DAO;

import io.springbootstarter.topic.RentItRepository;
import rentIt.Spring.BO.RegisterUserBO;

public class RegisterUserDAO {
	RentItRepository rentitObj;
	public String registerUser(RegisterUserBO obj) {
		
		
		RegisterUserBO save = rentitObj.save(obj);
		
		return null;
		
	}
	
	
}
