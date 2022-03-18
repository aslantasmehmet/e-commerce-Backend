package kodlamaio.sanalMarket.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.DistrictService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.DistrictDao;
import kodlamaio.sanalMarket.entities.concretes.District;

@Service
public class DistrictManager implements DistrictService {
	
	private DistrictDao districtDao;

	public DistrictManager(DistrictDao districtDao) {
		super();
		this.districtDao = districtDao;
	}

	@Override
	public DataResult<List<District>> getByTownId(int townId) {
		return new SuccessDataResult<List<District>>(this.districtDao.getByTownId(townId),"İlçeye göre Mahalleler getirildi");
	}
	

}
