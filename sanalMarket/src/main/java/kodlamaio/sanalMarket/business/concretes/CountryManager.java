package kodlamaio.sanalMarket.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.CountryService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.CountryDao;
import kodlamaio.sanalMarket.entities.concretes.Country;

@Service
public class CountryManager implements CountryService{
	
	private CountryDao countryDao;

	public CountryManager(CountryDao countryDao) {
		super();
		this.countryDao = countryDao;
	}

	@Override
	public DataResult<List<Country>> getAll() {
		return new SuccessDataResult<List<Country>>(this.countryDao.findAll(),"Ülkeler Getirme İşlemi Başarılı");
	}

	

}
