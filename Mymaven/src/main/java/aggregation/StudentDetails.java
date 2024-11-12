package aggregation;

public class StudentDetails {
	int id;
	String name;
	Address address;
	public StudentDetails(int id,String name,Address address)
	{
		this.id=id;
		this.address=address;
		this.name=name;
		
	}
	

	public static void main(String[] args) {
		
		Address obj1=new Address("Trivandrum","Kerala",695001);
		StudentDetails obj=new StudentDetails(34,"Asiya",obj1);
		obj.dipsly();
		

	}
	public void dipsly()
	{
		System.out.println(id+" "+name);
		System.out.println(address.City+" "+address.Pin+" "+address.State);
	}

}
