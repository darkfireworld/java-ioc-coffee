package test.ser;

import org.coffee.ioc.core.annotation.Autowired;
import org.coffee.ioc.core.annotation.Component;
import org.coffee.ioc.core.bean.BeanFactory;
import org.coffee.ioc.core.factory.FactoryBean;
import org.coffee.ioc.core.lifecycle.BeanLifeCycle;

import test.dao.IDao;

class I implements IHello , BeanLifeCycle,FactoryBean{
	@Autowired
	IDao dao;
	
	
	public IDao getDao() {
		return dao;
	}

	
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public void say() {
		System.out.println("qq");
		
	}


	public void setBeanName(String name) {
		System.out.println(name);
		
	}


	public void setBeanFactory(BeanFactory bf) {
		// TODO Auto-generated method stub
		
	}


	public void init() {
		// TODO Auto-generated method stub
		
	}


	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	public Object getObject() {
		return "String";
	}


	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
@Component()
public class Hello extends I{


	public void say() {
		System.out.println(dao.getString());
		
	}


}
