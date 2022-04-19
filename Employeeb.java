package com.binde;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employeeb {
	@Id
	private Integer empId;
	@Override
	public String toString() {
		return "Employeeb [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	private String empName;
	private Float empSal;

	public Employeeb() {}

	public Employeeb(Integer empId, String empName, Float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}

}
