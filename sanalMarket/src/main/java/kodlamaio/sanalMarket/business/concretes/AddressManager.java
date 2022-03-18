package kodlamaio.sanalMarket.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.AddressService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.AddressDao;
import kodlamaio.sanalMarket.entities.concretes.Address;

@Service
public class AddressManager implements AddressService{
	
private AddressDao addressDao;
	
	

	public AddressManager(AddressDao addressDao) {
		super();
		this.addressDao = addressDao;
	}

	@Override
	public Result add(Address address) {
		this.addressDao.save(address);
		return new SuccessResult("Adres ekleme işlemi başarılı");
	}

	@Override
	public DataResult<List<Address>> getAllByUserId(int userId) {
		return new SuccessDataResult<List<Address>>(this.addressDao.getAllByUserId(userId),"Kullanıcıya ait adresler getirildi");
	}

	@Override
	public DataResult<List<Address>> getAll() {
		return new SuccessDataResult<List<Address>>(this.addressDao.findAll(),"Bütün adresler getirildi");
	}
}
