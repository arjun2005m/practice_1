package bean_with_other_bean;

public class PersonBean {

	private int perid;
	private String pername;
	
	
	public int getPerid() {
		return perid;
	}
	public void setPerid(int perid) {
		this.perid = perid;
	}
	public String getPername() {
		return pername;
	}
	public void setPername(String pername) {
		this.pername = pername;
	}
	@Override
	public String toString() {
		return "PersonBean [perid=" + perid + ", pername=" + pername + "]";
	}
	
	
}
