package house;
import static java.lang.System.*;

import java.util.Arrays;
class Kitchen{
	int appliances[]={1,2,3,4,5};
	int array[] = new int[appliances.length];
	void method(){
		System.out.println("The values in appliances array are being printed");
	for(int i=0;i<appliances.length;i++) {
		System.out.println(appliances[i]);
		array[i]=appliances[i];	
	}
	System.out.println("These values are in second array");
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);	
	}
	}
	
}
class Hall{
public class Activity21_2 {

	public static void main(String[] args) {
		out.println("This is the first room while entering the house");
		// TODO Auto-generated method stub
		Kitchen obj=new Kitchen();
		obj.method();
	}

}
}
