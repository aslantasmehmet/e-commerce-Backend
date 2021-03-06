package kodlamaio.sanalMarket.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kodlamaio.sanalMarket.business.abstracts.ItemService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.core.utilities.result.Result;
import kodlamaio.sanalMarket.core.utilities.result.SuccessDataResult;
import kodlamaio.sanalMarket.core.utilities.result.SuccessResult;
import kodlamaio.sanalMarket.dataAccess.abstracts.ItemDao;
import kodlamaio.sanalMarket.entities.concretes.Item;

@Service
public class ItemManager implements ItemService{
	
	private ItemDao itemDao;

	@Autowired
	public ItemManager(ItemDao itemDao) {
		super();
		this.itemDao = itemDao;
	}

	@Override
	public Result add(Item item) {
		this.itemDao.save(item);
		return new SuccessResult("Ürün Ekleme İşlemi Başarılı"+"  Ürün ID : "+item.getId());
	}

	@Override
	public Result delete(int id) {
		this.itemDao.deleteById(id);
		return new SuccessResult("Silme İşlemi Başarılı");
	}

	@Override
	public DataResult<List<Item>> getCategory1Id(int cat1Id, int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return new SuccessDataResult<List<Item>>(this.itemDao.getCategory1Id(cat1Id,pageable),"Kategor1 id sine Göre Getirme İşlemi Başarılı");
	}
	
	@Override
	public DataResult<List<Item>> getAllCategory1Id(int cat1Id) {
		return new SuccessDataResult<List<Item>>(this.itemDao.getAllCategory1Id(cat1Id));
	}

	@Override
	public DataResult<Item> getById(int id) {
		return new SuccessDataResult<Item>(this.itemDao.getById(id),"Ürün Getirme İşlemi Başarılı");
	}

	@Override
	public DataResult<List<Item>> getByItemName(String itemName) {
		return new SuccessDataResult<List<Item>>(this.itemDao.getByName(itemName),"'"+itemName+"'"+" arama sonuçları ;");
	}

	@Override
	public DataResult<List<Item>> getByItemNamePageable(String itemName, int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return new SuccessDataResult<List<Item>>(this.itemDao.getByNamePageable(itemName, pageable));
	}

}
