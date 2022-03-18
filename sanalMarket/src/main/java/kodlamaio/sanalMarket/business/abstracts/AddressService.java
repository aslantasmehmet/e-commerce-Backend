package kodlamaio.sanalMarket.business.abstracts;

import java.util.List;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.entities.concretes.Address;

public interface AddressService {
	

	Result add(Address address);
	
	DataResult<List<Address>> getAllByUserId (int userId);
	
	DataResult<List<Address>> getAll ();
}
