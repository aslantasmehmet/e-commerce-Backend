package kodlamaio.sanalMarket.business.abstracts;

import java.util.List;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.entities.concretes.Cart;
import kodlamaio.sanalMarket.entities.dtos.CartDto;

public interface CartService {
	
Result add (Cart cart);
	
	Result delete (int id);
	
	Result decreaseAd (int userId, int itemId);
	Result increaseAd (int userId, int itemId);
	Result decreaseKg (int userId, int itemId);
	Result increaseKg (int userId, int itemId);
	
	DataResult<List<Cart>> getAllByUserId (int userId);

	DataResult<CartDto> getByUserIdTotalCartPrice (int userId);
	
	DataResult<List<Cart>> getAllByUserIdAndCartStatusIsTrue (int userId);

}
