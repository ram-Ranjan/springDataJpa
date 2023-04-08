package company.hibernate.spring.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Ceo {
	
	@Id
	@Value("101")
	private int ceoId;
	@Value("Ravi")
	private String ceoName;
	@Value("50000")
	private double salary;
	
	public int getCeoId() {
		return ceoId;
	}
	public void setCeoId(int ceoId) {
		this.ceoId = ceoId;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	

}
