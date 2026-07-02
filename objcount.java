package javaproject1;

public class objcount {
	static int count=0;
	{
		count++;
	}
	public static void main(String[] args) {
		objcount a=new objcount();
		objcount b=new objcount();
		objcount c=new objcount();
		System.out.println("no.of objs"+count) ;
	}

}
