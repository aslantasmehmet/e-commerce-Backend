package kodlamaio.sanalMarket.business.abstracts;

import java.util.List;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.Town;

public interface TownService {
	
	DataResult<List<Town>> getByCityId (int cityId);

}
