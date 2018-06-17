// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;

public class UserKey {
    private String name;
	private String userid;
	// @Id 
	// @GeneratedValue
	private long id;

	//In a full scale application, it is definitely ideal to store within Session a unique id to that user. 
	//Using @Id and @GeneratedValue would ensure that every instance created will be given its own unique long id.

    public UserKey(String name, String userid) {
        this.name = name;
        this.userid = userid;        
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    
}