package activity21_9_2021;
class Worker{
	int salaryrate;
    String name;
	public Worker(int salaryrate, String name) {
		super();
		this.salaryrate = salaryrate;
		this.name = name;
	}
	static int calcpay()
    {
            return 0;
    }
	
	
}
class Salariedworker extends Worker {
	static int pay;
	public Salariedworker(int salaryrate, String name,int pay) {
		super(salaryrate,name);
		this.salaryrate = salaryrate;
		this.name = name;
		this.pay= pay;
	}
	 static int calcpay()
     {
             return pay*40;
     }
	
}
class Dailyworker extends Worker{
	static int wagesperday;
	public Dailyworker(int salaryrate, String name,int wagesperday) {
		super(salaryrate,name);
		this.salaryrate = salaryrate;
		this.name = name;
		this.wagesperday=wagesperday;
		
	}
	 static int calcpay()
     {
             return wagesperday*7;
     }
	
}
public class Activity21_1 {
	public static void main(String[] args) 
    {
		Worker w=new Worker(0,"me1");
		Salariedworker sw=new Salariedworker(1,"me",50000);
		Dailyworker dw=new Dailyworker(2,"me1",6000);
		if (w instanceof Worker)        
        {
        System.out.println("w is instanceof Worker");        
        }
		if (sw instanceof Salariedworker)        
        {
        System.out.println("sw is instanceof Salariedworker");        
        }if (dw instanceof Dailyworker)        
        {
        System.out.println("dw is instanceof Dailyworker");        
        }
		Worker a[]= {new Salariedworker(1,"me",50000),
                new Dailyworker (2,"me1",6000)};
		for(int i=0;i<a.length;i++)
        {
                System.out.println(a[i].getClass()+" " +a[i].salaryrate +" "+a[i].name +" "+a[i].calcpay());
      
        }
    }
}
