//package finance;
//class Worker{
//	int salaryrate;
//    String name;
//	public Worker(int salaryrate, String name) {
//		super();
//		this.salaryrate = salaryrate;
//		this.name = name;
//	}
//	static int calcpay()
//    {
//            return 0;
//    }
//	
//	
//}
//class Salariedworker extends Worker {
//	static int pay;
//	public Salariedworker(int salaryrate, String name,int pay) {
//		super(salaryrate,name);
//		this.salaryrate = salaryrate;
//		this.name = name;
//		this.pay= pay;
//	}
//	 static int calcpay()
//     {
//             return pay*40;
//     }
//	
//}
//class Dailyworker extends Worker{
//	static int wagesperday;
//	public Dailyworker(int salaryrate, String name,int wagesperday) {
//		super(salaryrate,name);
//		this.salaryrate = salaryrate;
//		this.name = name;
//		this.wagesperday=wagesperday;
//		
//	}
//	 static int calcpay()
//     {
//             return wagesperday*7;
//     }
//	
//}
//class Payment {
//	int payment;
//	public void getPayinfo() {
//		System.out.println("this is the payment"+payment*30);
//		
//	}
//	
//}
//
//interface Payable{
//	void getPayinfo();
//}
//public class Activity21_4 extends Payment implements calcpay{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
