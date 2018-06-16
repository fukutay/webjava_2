package jp.co.systena.model;

public class Job {
  private int id;
  private String name;
  private String status;
  private int salary;

  public Job(int id, String name, String status, int salary) {

    this.id = id;
    this.name = name;
    this.status = status;
    this.salary = salary;
  }

  public Job() {

  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
   return this.name;
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
   return this.salary;
 }

 public void setSalary(int salary) {
   this.salary = salary;
 }
}
