package accessModifer;

public class employee implements clonable  {
           int id;
           String name;
           double salary;
           
           public employee (int id, String name , double salary)
           {
        	   super();
        	   this.id= id;
        	    this.name = name;
        	    this.salary = salary;
        	    
           }
           public employee() {
			// TODO Auto-generated constructor stub
		}
		   public Object clone () throws CloneNotSupportedException
           {
        	   return super.clone()
           }
           @Override 
           public String toString() {
        	   return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
           }
           
	public static void main(String[] args) 
		throws CloneNotSupportedException
		
		{
		employee e1 = new employee ();
		Object e2 = c1.clone();
		System.out.println(e2);
		System.out.println(e3);
	}

}
