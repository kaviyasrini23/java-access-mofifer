package accessModifer;
import java.util.Objects;
public class emp {
      int id;
      String name;
      
  public emp(int id , String name)
  {
	 super ();
	 this.id=id;
	 this.name= name;
	 
  }
  @Override
  public String toString()
  {
	return id +":" + name;
	  
  }
  @Override
  public boolean equals(Object obj)
  {
	if(obj instanceof emp)
	{
		emp e = (emp) obj;
		return this.id == e.id && this.name.equals(e.name);
		
	}
	 return false; 
  }
  
  @Override 
  public int hashCode()
  {
	return Objects.hash(id, name);
  }
  @Override 
  public void finalize() {
	 System.out.println("called before the garbage collection");
  }
  
	public static void main(String[] args) {
		
           emp e1 = new emp(1,"dinga");
           emp e2 = new emp(2,"dingi");
 
       System.out.println(e1);
       System.out.println(e2);
       
       e1=null;
       e2=null;
       
       System.gc();
	}

}
