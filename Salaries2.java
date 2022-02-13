import  java.util.Scanner;
import java.lang.Exception; 
import java.util.*;
import java.io.*; 
 
 

abstract  class  Employee {
 
  String name;
  int age;

  
 abstract void salaryperhour(double salperhr)throws NegativeResultException, ZeroResultException;
 abstract  double  calculateSalary () throws ZeroResultException;
 abstract  String  getName();
 
 Employee (String name, int age) {
      this.name = name;
      this.age = age;
 }
 Employee () {
 }
}



//CLASS MANAGER
 
 
class  Manager  extends  Employee {
  
 static double salperhr=0; 
 double hours;
 
 Manager ( String name, int age,double hours) throws NegativeResultException {
	 super (name, age);
	 if(hours<0){
		 throw new NegativeResultException("Exception");
	 }else{

	this.hours = hours ;
	 }
 }
 
  Manager () {}
  
  public void salaryperhour(double salperhr) throws NegativeResultException, ZeroResultException{
	  if(salperhr<0){
		  throw new NegativeResultException("Exception");
	  }else if(salperhr==0){
		  throw new ZeroResultException("Exception");
	  }else{
	 this.salperhr=salperhr;
 }
  }
 
  public  double  calculateSalary () throws ZeroResultException{
	 if(salperhr==0){
		 throw new ZeroResultException("Exception");
	 }else{
	return salperhr * hours;
	 }
 }
 
 public  String  getName () {
	return "The Manager "+name+" worked for "+hours+" hours, at rate "+salperhr+" dollars per hours and earned"; 
 }
 
}




//CLASS RECEPTIONIST


 
class  Receptionist  extends  Employee {
 
 static double salperhr=0;
 double hours;
  
 Receptionist( String name, int age,double hours) throws NegativeResultException{
	  super (name, age);
	 if(hours<0){
		 throw new NegativeResultException("Exception");
	 }else{
 this.hours = hours ;
	 }
 }
 
 Receptionist () {}
 
  public void salaryperhour(double salperhr) throws NegativeResultException, ZeroResultException{
	  if(salperhr<0){
		  throw new NegativeResultException("Exception");
	  }else if(salperhr==0){
		  throw new ZeroResultException("Exception");
	  }else{
	 this.salperhr=salperhr;
 }
  }
 
   public  double  calculateSalary () throws ZeroResultException {
	 if(salperhr==0){
		 throw new ZeroResultException("Exception");
	 }else{
	
	return salperhr * hours;
	 }
 }
 

 public  String  getName () {
	return "The Receptionist "+name+" worked for "+hours+" hours, at rate"+salperhr+" dollars per hours and earned";
 }
}





//CLASS SALESPERSON


 
class  Salesperson  extends  Employee {
 
 static double salperhr=0;
 double hours;

 Salesperson( String name, int age,double hours) throws NegativeResultException{
	  super (name, age);
	 if(hours<0){
		 throw new NegativeResultException("Exception");
	 }else{
 this.hours = hours ;
	 }
 }
 
 Salesperson () {}
   
 public void salaryperhour(double salperhr) throws NegativeResultException, ZeroResultException{
	  if(salperhr<0){
		  throw new NegativeResultException("Exception");
	  }else if(salperhr==0){
		  throw new ZeroResultException("Exception");
	  }else{
	 this.salperhr=salperhr;
 }
  }
 
 public  double  calculateSalary () throws ZeroResultException{
	 if(salperhr==0){
		 throw new ZeroResultException("Exception");
	 }else{
	
	return salperhr * hours;
	 }
 }
 
 public  String  getName () {
 return "The Salesperson "+name+" worked for "+hours+" hours, at rate"+salperhr+" dollars per hours and earned";
 }
 
}
 
 
 
 
 //CLASS ACOUNTANT
 
 
 
 
class  Accountant extends  Employee {
 
 static double salperhr=0;
 double hours;

 Accountant( String name, int age,double hours) throws NegativeResultException{
	  super (name, age);
	 if(hours<0){
		 throw new NegativeResultException("Exception");
	 }else{

 this.hours = hours ;
	 }

 }
  Accountant () {}
  
 public void salaryperhour(double salperhr) throws NegativeResultException, ZeroResultException{
	  if(salperhr<0){
		  throw new NegativeResultException("Exception");
	  }else if(salperhr==0){
		  throw new ZeroResultException("Exception");
	  }else{
	 this.salperhr=salperhr;
   }
  }
 
  public  double  calculateSalary () throws ZeroResultException{
	 if(salperhr==0){
		 throw new ZeroResultException("Exception");
	 }else{
	
 return salperhr * hours;
	 }
 }
 
 public  String  getName () {
 return "The Accountant "+name+" worked for "+hours+" hours, at rate"+salperhr+" dollars per hours and earned";
 }
}
 
 
 
 
 
//CLASS SENIORSALESPERSON
 
 

class SeniorSalesperson extends Salesperson implements Bonus{

 
 SeniorSalesperson(String name, int age, double hours)throws SeniorAgeException, NegativeResultException{	 
 super (name, age, hours);
 if(age<35){
	 throw new SeniorAgeException("Exception");
 }else{
	
 }
 }
 
 
 public  double  calculateSalary () throws ZeroResultException {
	 if(salperhr==0){
		 throw new ZeroResultException("Exception");
	 }else{
 return  super.salperhr * hours + bonus;
	 }
 }
}
 
 
 
 //CLASS SENIORACCOUNTANT
 
 
 

 
class SeniorAccountant extends Accountant implements Bonus{

 
 SeniorAccountant(String name, int age,double hours)throws SeniorAgeException, NegativeResultException{
		 super (name, age, hours);
		  if(age<35){
	 throw new SeniorAgeException("Exception");
      }else{
		  
	  }
 }
  public  double  calculateSalary () throws ZeroResultException {
	 if(salperhr==0){
		 throw new ZeroResultException("Exception");
	 }else{
 return  super.salperhr * hours + bonus;
	 }
 }
}
 
 
 
 //INTERFACE BONUS
 

 interface Bonus{
 
  double bonus =  200;
}
 
 
 
 
 //CLASS STAFFS
 
 
class Staffs{
	int maxstaffs=15;
	Employee[ ] stf=new Employee[maxstaffs];
	int noofstaffs=0; 
  
  
 public void addEmployee( Employee b) {
		++noofstaffs;
		if(noofstaffs<=maxstaffs) 
			{stf[noofstaffs - 1 ] = b;
		}else{System.out.println("No more than 15 employees");
		}
		}
 
 
 public  void  displaySalaries() throws ZeroStaffsException { 
		if(noofstaffs==0){
			throw new ZeroStaffsException("Exception");
		}else{
			System.out.println(" ####### DISPLAYING EMPLOYEE SALARY SHEET #######");
			for ( int i=0; i<noofstaffs; i++){
		try{
			
			System.out.println(stf[i].getName()+"  "+stf[i].calculateSalary()+" Dollars " );
		}catch (ZeroResultException e){
			System.out.println( "!! Caught Exception - Salary per hour is zero, update salary per hour from menu");
 }
 }
 }
 }
 }
 
 
 
 
 
 ////CLASS SALARIES MAIN
 
 
 
public  class  Salaries2{
 
 public  static  void  main ( String [] args ) {


 try {
 File welobj = new File("Welcome.txt");
  Scanner myReader = new Scanner(welobj);
  while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
	  } catch (FileNotFoundException e) {
      System.out.println(" !!Caught exception - Welcome Header File Missing!!");
    }
	

 Staffs p =  new  Staffs ();
 Scanner sc = new Scanner(System.in);
 
 int exit1=0; 
 
	do{ 
		
		
	try {
		File menuobj = new File("Menu.txt");
		Scanner myReader = new Scanner(menuobj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
			}
     } catch (FileNotFoundException e) {
			System.out.println(" !1 Caught exception - Menu Header File Missing!!");
    }
 char ch = sc.next().charAt(0);
 switch(ch){
	 case 'a' :
	 int exit2=0; 
		 do{  
	      try {
				File addobj = new File("AddEmployee.txt");
				Scanner myReader = new Scanner(addobj);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					System.out.println(data);
					}
		} catch (FileNotFoundException e) {
				System.out.println("!! Caught Exception - Add Employee Header File Missing!! ");
			}
	     char ch1 = sc.next().charAt(0);
	 
	      switch(ch1){
	         case 'a' :
				System.out.println("    Insert Manager details.");
				System.out.println("    Name of the Manager: ");
				sc.nextLine();
				String name1 = sc.nextLine();
				System.out.println("    Age of Manager: ");
				int age1 = sc.nextInt();
				System.out.println("    Number of Hours Worked: ");
				double hours1 = sc.nextDouble();
				try{
				p.addEmployee(new Manager(name1, age1, hours1));
				}catch(NegativeResultException e){
				System.out.println(" !!Caught exception - hours cannot be negative!! ");
				}
				break;
	         case 'b' :
				System.out.println("    Insert Receptionist details.");
				System.out.println("    Name of the Receptionist: ");
				sc.nextLine();
				String name2 = sc.nextLine();
				System.out.println("    Age of Receptionist: ");
				int age2 = sc.nextInt();
				System.out.println("    Number of Hours Worked: ");
				double hours2 = sc.nextDouble();
				try{
				p.addEmployee(new Receptionist(name2, age2, hours2));
				}catch(NegativeResultException e){
				System.out.println("!!Caught exception - hours cannot be negative!! ");
				}
				break;
	         case 'c' :
				System.out.println("    Insert Salesperson details.");
				System.out.println("    Name of the Salesperson: ");
				sc.nextLine();
				String name3 = sc.nextLine();
				System.out.println("    Age of Salesperson: ");
				int age3 = sc.nextInt();
				System.out.println("    Number of Hours Worked: ");
				double hours3 = sc.nextDouble();
				try{
				p.addEmployee(new Salesperson(name3, age3, hours3));
				}catch(NegativeResultException e){
				System.out.println("!!Caught exception - hours cannot be negative!!");
				}break;
	         case 'd' :
		    	System.out.println("    Insert Accountant details.");
				System.out.println("    Name of the Accountant: ");
				sc.nextLine();
				String name4 = sc.nextLine();
				System.out.println("    Age of Accountant: ");
				int age4 = sc.nextInt();
				System.out.println("    Number of Hours Worked: ");
				double hours4 = sc.nextDouble();
				try{
				p.addEmployee(new Accountant(name4, age4, hours4));
				}catch(NegativeResultException e){
				System.out.println("!!Caught exception - hours cannot be negative!!");
				}break;
		    case 'e' :
				System.out.println("	Insert SeniorSalesperson details.");
                System.out.println("	Name of the SeniorSalesperson: ");
				sc.nextLine();
				String name5 = sc.nextLine();
				System.out.println("	Age of SeniorSalesperson: ");
				int age5 = sc.nextInt();
				System.out.println("	Number of Hours Worked: ");
				double hours5 = sc.nextDouble();
				try{
				p.addEmployee(new SeniorSalesperson(name5, age5, hours5));
				}catch(NegativeResultException e){
			  System.out.println("!!Caught exception - hours cannot be negative!!");
			 }catch(SeniorAgeException e){
				 System.out.println("!!Caught exception - Senior Employee Age must be above 35!!");
			 }
				break;
			case 'f' :
				System.out.println("	Insert SeniorAccountant details.");
				System.out.println("	Name of the SeniorAccountant: ");
				sc.nextLine();
				String name6 = sc.nextLine();
				System.out.println("	Age of SeniorAccountant: ");
				int age6 = sc.nextInt();
				System.out.println("	Number of Hours Worked: ");
				double hours6 = sc.nextDouble();
				try{
				p.addEmployee(new SeniorAccountant(name6, age6, hours6));
				}catch(NegativeResultException e){
			  System.out.println(" !!Caught exception - hours cannot be negative !! ");
			 }catch(SeniorAgeException e){
				 System.out.println("!! Caught Exception - Senior employee Age must be above 35!!");
			 }
				break;
				case 'g' :
			
				exit2=1;  
				break;
			    }
		  }while(exit2==0);
     break;
		
     case 'b' :  
	 
		int exit3 = 0; 
		do{
	  try {
			File upobj = new File("UpdateSalary.txt");
			Scanner myReader = new Scanner(upobj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
				System.out.println("!! Caught Exception - Update Salary Header File Missing");
		}
		char ch2 = sc.next().charAt(0);
	    switch(ch2){ 
			case 'a' :
				Employee em1 = new Manager();
				System.out.println("	Enter the new Salary Per Hour for Manager position");
				double salperhr1 = sc.nextDouble();
				
				try{
				em1.salaryperhour(salperhr1);
				}catch(ZeroResultException e){
					System.out.println(" !!Caught exception - Salary Per Hour cannot be zero!!");
				}catch(NegativeResultException e){
					System.out.println(" !!Caught exception - Salary Per Hour cannot be Negative!!");
				}
				break;
			case 'b' :
				Employee em2 = new Receptionist();
				System.out.println("	Enter the new Salary Per Hour for Receptionist position");
				double salperhr2 = sc.nextDouble();
				
				try{
				em2.salaryperhour(salperhr2);
				}catch(ZeroResultException e){
					System.out.println(" !!Caught exception - Salary Per Hour cannot be zero !!");
				}catch(NegativeResultException e){
					System.out.println(" !!Caught exception - Salary Per Hour cannot be Negative!!");
				}
				break;
			case 'c' :
				Employee em3 = new Salesperson();
				System.out.println("	Enter the new Salary Per Hour for Salesperson position");
				double salperhr3 = sc.nextDouble();
		
				try{
				em3.salaryperhour(salperhr3);
				}catch(ZeroResultException e){
					System.out.println(" !!Caught exception - Salary Per Hour cannot be zero!!");
				}catch(NegativeResultException e){
					System.out.println(" !!Caught exception - Salary Per Hour cannot be Negative!!");
				}
				break;
			case 'd' :
				Employee em4 = new Accountant();
				System.out.println("	Enter the new Salary Per Hour for Accountant position");
				double salperhr4 = sc.nextDouble();
				
				try{
				em4.salaryperhour(salperhr4);
				}catch(ZeroResultException e){
					System.out.println(" !!Caught exception - Salary Per Hour cannot be zero!!");
				}catch(NegativeResultException e){
					System.out.println(" !!Caught exception - Salary Per Hour cannot be Negative!!");
				}
				break;
			case 'e' :
				exit3=1;
				break;
				}		 
	      }while (exit3==0);
	  break;	 
	case 'c' : 
	try{
    	p.displaySalaries();
	}catch(ZeroStaffsException e){
		System.out.println(" !!Caught exception - There is no employee entered in database. Please Enter Employee from menu!!");
	}
        break;
	case 'd' : 
	    exit1=1;
        break;
       }
	 }while(exit1==0);

}
}




class ZeroResultException extends Exception{
	ZeroResultException(String message){
		super(message);
	}
}

class NegativeResultException extends Exception{
	NegativeResultException(String message){
	super(message);
}
}	

class ZeroStaffsException extends Exception{
	ZeroStaffsException(String message){
	super(message);
}
}

class SeniorAgeException extends Exception{
	SeniorAgeException(String message){
		super(message);
	}
}
