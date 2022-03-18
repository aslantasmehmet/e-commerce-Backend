package kodlamaio.sanalMarket.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.TownService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.TownDao;
import kodlamaio.sanalMarket.entities.concretes.Town;

@Service
public class TownManager implements TownService {
	
	private TownDao townDao;

	public TownManager(TownDao townDao) {
		super();
		this.townDao = townDao;
	}

	@Override
	public DataResult<List<Town>> getByCityId(int cityId) {
		return new SuccessDataResult<List<Town>>(this.townDao.getByCityId(cityId));
	}
	

}
