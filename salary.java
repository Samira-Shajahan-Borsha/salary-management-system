import  java.util.Scanner;
 
abstract  class  Employee {
 
  String name;
  int age;
 
 abstract  double salaryperhour (double salperhr);
 abstract  double  calculateSalary ();
 abstract  String  getName ();
 
 Employee (String name, int age) {
      this.name = name;
      this.age = age;
 }
}
 
class  Manager  extends  Employee {
 
 double salperhr=0;
 int hours;
 
 Manager ( String name, int age,int hours) {
 super (name, age);
 this.hours = hours ;
 }
 
  public double salaryperhour(double salperhr){
	 this.salperhr=salperhr;
 }
 
 public  double  calculateSalary () {
 return salperhr*hours;
 }
 
 public  String  getName () {
 return "The Manager "+name;
 }
 
}
 
class  Receptionist  extends  Employee {
 
 double salperhr=0;
 int hours;
 
 Receptionist( String name, int age,int hours) {
 super (name, age);
 this.hours = hours ;
 }
 
 public double salaryperhour(double salperhr){
	 this.salperhr=salperhr;
 }
 
 public  double  calculateSalary () {
 return salperhr*hours;
 }
 
 public  String  getName () {
 return  "The Receptionist "+name;
 }
 
}
 
class  Salesperson  extends  Employee {
 
 double salperhr=0;
 int hours;
 
 Salesperson( String name, int age,int hours) {
 super (name, age);
 this.hours = hours ;
 }
 
 public double salaryperhour(double salperhr){
	 this.salperhr=salperhr;
 }
 
 public  double  calculateSalary () {
 return salperhr*hours;
 }
 
 public  String  getName () {
 return   "The Salesperson "+name;
 }
 
}
 
 
class  Accountant extends  Employee {
 
 double salperhr=0;
 int hours;
 
 Accountant( String name, int age,int hours) {
 super (name, age);
 this.hours = hours ;
 }
 
 public double salaryperhour(double salperhr){
	 this.salperhr=salperhr;
 }
 
 public  double  calculateSalary() {
 return salperhr*hours;
 }
 
 public  String  getName () {
 return  "The Accountant "+name;
 }
 
}
 
class SeniorSalesperson extends Salesperson implements Bonus{
 
 SeniorSalesperson(String name, int age, int hours){
 super (name, age, hours);
 }
 public double salaryperhour(double salperhr){
	 this.salperhr=salperhr;
 }
 public  double  calculateSalary () {
 return  super.salperhr*hours + bonus;
 }
}
 
class SeniorAccountant extends Accountant implements Bonus{
 
 SeniorAccountant(String name, int age, int hours){
 super (name, age, hours);
 }
 public double salaryperhour(double salperhr){
	 this.salperhr=salperhr;
 }
 public double calculateSalary(){
 return  super.salperhr*hours + bonus;
 }
}
 
 interface Bonus{
 
  double bonus =  200;
}
 
class Staffs{
	
 Employee[ ] stf=new Employee[15];
 
 public void addEmploye( Employee b) {
	 int noofstaffs=1; 
     if(noofstaffs<=15) 
      {stf[noofstaffs - 1 ] = b;
  noofstaffs++;
 }else{System.out.println("No more than 15 employees");
 }
 }
 
 public  void  displaySalaries() {
 for ( int i=0; i<noofstaffs; i++){
 System.out.println(stf.getName()+" earned "+stf.calculateSalary()+" Dollars " );
 }
 }

 
 public  double  salaryAverage () {
 int noofstaffs=0 ;
 double avgsal=0 ;
 while (noofstaffs<stf.length()){
 for (int i=0; i<stf.length; i++){
avgsal+=stf.calculateSalary(); 
noofstaffs++ ;
 }
 }
 return avgsal/stf.length;
 }
}
 
 
public  class  Salary{
 
 public  static  void  main ( String [] args ) {
 
 Staffs p =  new  Staffs ();
 
p.addEmployee(new Salesperson( " Pierre ", 45, 30000 ));
p.addEmployee(new Receptionist( " Leon " ,  25 ,  20000 ));
p.addEmployee(new Manager( " Yves " ,  28 ,  1000 ));
p.addEmployee(new Accountant( " Jane " , 32 , 45 ));
p.addEmployee(new SeniorAccountant ( " Al " ,  30 , 45 ));
p.addEmployee(new SeniorSalesperson ( " Jean-Philipe " ,  30 ,  1000 ));
 
 
p.displaySalaries();
 System.out.println( " The average salary in the company is "  + p.salaryAverage() +  " francs. " );
 
 }
}