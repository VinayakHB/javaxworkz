class Student{
 String name;
 int rollno;
 String branch;
 String collegename;
 
 void Studentdetails(){
 System.out.println(name+" is from " +branch+ " branch ");
 }
 
 public static void main(String[] args){
   Student student = new Student();
   Student student2 = new Student();
   
   student.name = "Ram";
   student.rollno = 95;
   student.branch = "Mechanical";
   student.collegename = "KLE";
     
	 
	 student2.name = "vijay";
     student2.rollno = 100;
	 student2.branch = "civil";
	 
	 student.Studentdetails();
     student2.Studentdetails(); 
	 
   
 }
 }
 