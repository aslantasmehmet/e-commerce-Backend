package kodlamaio.sanalMarket.business.abstracts;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.entities.concretes.User;

public interface UserService {
	
	Result add (User user);

	DataResult<User> getByEmail (String email);
	
	DataResult<User> getById (int id);
	
	DataResult<User> getByUserName (String userName);

}
