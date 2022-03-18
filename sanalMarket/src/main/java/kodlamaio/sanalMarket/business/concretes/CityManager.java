package kodlamaio.sanalMarket.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.CityService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.CityDao;
import kodlamaio.sanalMarket.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;

	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getByCountryId(int countryId) {
		return new SuccessDataResult<List<City>>(this.cityDao.getByCountryId(countryId),"Ülkenin Şehirleri Getirme İşlemi Başarılı");
	}
}
