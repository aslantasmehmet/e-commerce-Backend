package kodlamaio.sanalMarket.business.abstracts;

import java.util.List;

import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.entities.concretes.Image;

public interface ImageService {
	
	DataResult<List<Image>> getAll();
	
	Result add(Image image);
	
	DataResult<List<Image>> getByItemId(int itemId);
	
	

}
