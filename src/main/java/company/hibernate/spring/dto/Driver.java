package company.hibernate.spring.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.Query;

public class Driver {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ran");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();

	public void addCompany()
	{
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mycompany.xml");
		Company company = applicationContext.getBean("company",Company.class);
		Ceo ceo=company.getCeo();
		entityTransaction.begin();
		entityManager.persist(ceo);
		entityManager.persist(company);
		entityTransaction.commit();
		
	}
public void updateCompany()
{
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mycompany.xml");
	Company company = applicationContext.getBean("company",Company.class);
	
	Company company2=entityManager.find(Company.class, company.getCompanyId());
	company2.setCompanyName("Aiims");
	//company2.getCeo().setCeoId(111);
	entityTransaction.begin();
	entityManager.merge(company2);
	entityTransaction.commit();
	
	
}
public static void main(String[] args) {
	Driver driver=new Driver();
	//driver.addCompany();
	driver.updateCompany();
	
	

}



}
