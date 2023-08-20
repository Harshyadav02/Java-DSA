public class _01_Class_Concept{

	public static void main(String[] args) {

		// Object creation of student class

		Student student_object = new Student();

		// Accesing data of class Student by object reference
		System.out.println(student_object.first_name);
		System.out.println(student_object.last_name);
		System.out.println(student_object.roll);
		
	}
}

// Created a student class
class Student{

	String first_name  = "Harsh";
	String last_name = "Yadav";
	int roll = 32;

}

/*
	new keyword is used to create object once the object created the object is hold at a varible also called as reference variable (In our case student_object is refrence variable)
*/
