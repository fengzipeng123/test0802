package jj;



public class test1 {
   public static void main(String[] args) {
	System.out.println("hello");
	int id =15;
	int ids,ages;
	String names,ssString;
	String name = "计科";
	int age = 44;
	String ss = "男";
	User user =  new User(id,name,age,ss);
	
	ages=user.getAge();
	System.out.println(user);
	System.out.println("二次");
	System.out.println("三次");
	System.out.println("四次");
	System.out.println("五次");
}
}
