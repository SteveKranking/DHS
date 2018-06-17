public class Employee {
    
    private boolean managerFlag;
    private long id;
    private String name;
    private Date dateHired;
    private boolean fullTime;
    private boolean partTime;

    //There were 2 ways I thought about doing this, the first was simply a string for Employment type
    //that in this scenario I would set to either Full or Part time
    //However, I ultimately thought that for the sake of simplicity and pure readability that having a boolean
    //For each employment type was best. However, if memory were to be an issue, choosing the former would
    //be best

    public Employee(boolean managerFlag, long id, String name, Date dateHired, boolean fullTime, boolean partTime) {
         this.dateHired = dateHired;
         this.managerFlag = managerFlag;
         this.name = name;
         this.fullTime = fullTime;
         this.partTime = partTime;
         this.id = id;
    }

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
    }
    
    public Date getDateHired() {
		return dateHired;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
    }
    
    public long getId() {
		return id;
	}
	public void setId (long id) {
		this.id = id;
    }
    
    public boolean getMangerFlag() {
		return managerFlag;
	}
	public void setMangerFlag(boolean managerFlag) {
		this.managerFlag = managerFlag;
    }
    
    public boolean getFullTime() {
		return fullTime;
	}
	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
    }
    
    public boolean getPartTime() {
		return partTime;
	}
	public void setPartTime(boolean partTime) {
		this.partTime = partTime;
	}


	
}