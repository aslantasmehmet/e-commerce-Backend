package kodlamaio.sanalMarket.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.ImageService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.ImageDao;
import kodlamaio.sanalMarket.dataAccess.abstracts.ItemDao;
import kodlamaio.sanalMarket.entities.concretes.Image;
import kodlamaio.sanalMarket.entities.concretes.Item;

@Service
public class ImageManager  implements ImageService{
	
	private ImageDao imageDao;
	private ItemDao itemDao;

	public ImageManager(ImageDao imageDao, ItemDao itemDao) {
		super();
		this.imageDao = imageDao;
		this.itemDao = itemDao;
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(),"Resimleri Getirme İşlemi Başarılı");
	}

	@Override
	public Result add(Image image) {
		LocalDate now = LocalDate.now();
		image.setDateOfCreation(now);
		this.imageDao.save(image);
		Item item = this.itemDao.getById(image.getItemId());
		item.setImageUrl(image.getImageUrl());
		return new SuccessResult("Başarıyla eklendi");
	}

	@Override
	public DataResult<List<Image>> getByItemId(int itemId) {
		return new SuccessDataResult<List<Image>>(this.imageDao.getByItemId(itemId),"Ürüne Ait Resimleri Getirme İşlemi Başarılı");
	}
	

}
