package activity21_9_2021;

import java.util.Scanner;

class Emp{
	int  empId;                              
	String  empName;            
	String  designation ;                
	double basic ;
	float percent;
	public Emp(int empId, String empName, String designation,double basic) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic=basic;
		if(basic<50000) {
			try {
                throw new LowSalException();

            } 
            catch (LowSalException e) {
                System.out.println(e);
            }
		}
	}
	
	
	void printDET(float percent) {
		final double hra=basic*percent;
		System.out.println("The details are:"+ basic+","+hra);
		
	}
	 void calculateHRA() {
	  
		if(designation.equals("Manager")) {
			percent=0.1f;
			}
		if(designation.equals("TeamLeader")){
			percent=0.12f;
		}
		if(designation.equals("HR")){
			percent=0.05f;
		}
		printDET((float) percent);
		
		
	}
	

}
class LowSalException extends Exception {
    @Override
    public String toString() {
        return "There is low balance than 50000 Rs";
               
    }
}
public class Activity21_8 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your id");
		int ID=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter your name");
		String NAME=scan.nextLine();
		System.out.println("Enter your Designation");
		String DSG=scan.nextLine();
		System.out.println("Enter your salary");
		int BASIC=scan.nextInt();
		Double d=Double.valueOf(BASIC);
		System.out.println(d);
		Emp obj=new Emp(ID,NAME,DSG,d);
		obj.calculateHRA();
		
		
		

	}

}
