package jp.co.systena.model;

public class Form {

  private int id;
  private String name;
  private String status;
  private int salary;
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
	return this.status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
  
  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
