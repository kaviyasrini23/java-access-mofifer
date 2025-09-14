package accessModifer;

import java.util.Objects;


public class Studentt {             
	      // 11 nsm
	int id ;
	String name;
	int age;
	
	public Studentt (int id , String name , int age )
	{
		super();
		this.id= id;
		this.name=name;
		this.age= age;
	}
	
	@Override 
	public boolean equals(Object obj) {
	    if (obj instanceof Studentt) {
	        Studentt s = (Studentt) obj;
	        return this.id == s.id &&
	               this.name.equals(s.name) &&
	               this.age == s.age;
	    }
	    return false;
	}

	@Override
	public int hashCode() {
	    return Objects.hash(id, name, age);
	}

	
	public static void main(String[] args) {
       Studentt s1 = new Studentt (1,"pranav" , 16);
       Studentt s2 = new Studentt (2,"gaja" , 17);
       Studentt s3 = new Studentt (1,"pranav" , 16);
       marker m1 = new marker ("blue" , 100);
       
       System.out.println(s1.equals(s2));
       System.out.println(s2.equals(s3));
	   System.out.println(s1.equals(s3));
       System.out.println(s1.equals(m1));
       
       System.out.println(s1.hashCode());
       System.out.println(s2.hashCode());
       System.out.println(s3.hashCode());
       
	}
}
// op:
//false
//false
//true
//false
//-322093428
//98148993
//-322093428
