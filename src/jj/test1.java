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
}
}
