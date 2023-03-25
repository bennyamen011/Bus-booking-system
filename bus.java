package bookingsystem;

public class bus {
	private int busno;
	private boolean ac;
	private int capacity;
	private String DriveName;

	
	public String getDriveName() {
		return DriveName;
	}


	public void setDriveName(String drive) {
		DriveName = drive;
	}


	public int getBusno() {
		return busno;
	}


	public void setBusno(int no) {
		this.busno = no;
	}


	public boolean isAc() {
		return ac;
	}


	public void setAc(boolean ac) {
		this.ac = ac;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int cap) {
		this.capacity = cap;
	}


	public bus(int no, boolean ac, int cap,String drive) {
		super();
		this.busno = no;
		this.ac = ac;
		this.capacity = cap ;
		this.DriveName=drive;
	}
	public void displaybusinfo() {
		System.out.println("Bus No:" + busno +  "  A/C:"  + ac + 
				"  Capacity of the bus is:" + capacity+"  "
						+ " Drivername :"+DriveName );
	} 

}
