package jp.co.systena.model;

public class EntryForm {

  private int id;
  private String name;
  private String cname;
  private String status;
  private String motive;
  
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
  
  public String getCName() {
	return cname;
  }

  public void setCName(String cname) {
	this.cname = cname;
  }

  public String getStatus() {
	return this.status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
  
  public String getMotive() {
    return motive;
  }

  public void setMotive(String motive) {
    this.motive = motive;
  }
}
