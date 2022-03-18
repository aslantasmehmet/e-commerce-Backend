package kodlamaio.sanalMarket.business.abstracts;

import java.util.List;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.District;

public interface DistrictService {
	
	DataResult<List<District>> getByTownId(int townId);

}
