package SmallStudentProject;

public class emp {
	
	private int empid;
	private String empName;
	private int empage;
	private String empDes;
	private double empSal;
	
	
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", empName=" + empName + ", empage=" + empage + ", empDes=" + empDes
				+ ", empsal=" + empSal + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public String getEmpDes() {
		return empDes;
	}
	public void setEmpDes(String empDes) {
		this.empDes = empDes;
	}
	public double getEmpsal() {
		return empSal;
	}
	public void setEmpsal(double empsal) {
		this.empSal = empsal;
	}
	
	

}
