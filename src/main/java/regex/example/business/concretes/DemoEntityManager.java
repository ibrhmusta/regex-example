package regex.example.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import regex.example.business.abstracts.DemoEntityService;
import regex.example.dataAccess.DemoEntityDao;
import regex.example.entities.DemoEntity;

@Service
public class DemoEntityManager implements DemoEntityService{
	private DemoEntityDao demoEntityDao;
	
	@Autowired
	public DemoEntityManager(DemoEntityDao demoEntityDao) {
		super();
		this.demoEntityDao = demoEntityDao;
	}


	@Override
	public DemoEntity add(DemoEntity demoEntity) {
		return demoEntityDao.save(demoEntity);
	}

}
