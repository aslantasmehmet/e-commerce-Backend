package kodlamaio.sanalMarket.business.abstracts;

import java.util.List;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.City;

public interface CityService {
	
	DataResult<List<City>> getByCountryId (int countryId);

}
