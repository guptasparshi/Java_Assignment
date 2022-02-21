// ***Uncomment the code you want to execute.***


//Q1-) Implement your  own abstract  classes and  interfaces

// Interface class

//interface EmployeeInterface {
//
//	public abstract void startHour();
//
//	public abstract void endHour();
//}
//
//
//// Abstract class
//
//abstract class EmployeeAbstract implements EmployeeInterface {
//
//	public void salary(int salary) {
//		System.out.println("The Employee makes Rs." + salary + " per month");
//	}
//}
//
//public class assignment1 extends EmployeeAbstract {
//
//	@Override
//	public void startHour() {
//		System.out.println("Starts at 09:00");
//	}
//
//	@Override
//	public void endHour() {
//		System.out.println("Ends at 18:00");
//	}
//
//	public static void main(String[] args) {
//		EmployeeAbstract employeeAbstract = new assignment1();
//		int salary = 100000;
//		employeeAbstract.salary(salary);
//		employeeAbstract.startHour();
//		employeeAbstract.endHour();
//	}
//}




//Q2-) Implement your own encapsulating classes

//class StudentEncapsulation {
//	private String studentName;
//	private int studentRollNo;
//	private int studentAge;
//
//	public int getAge() {
//		return studentAge;
//	}
//
//	public String getName() {
//		return studentName;
//	}
//
//	public int getRollNo() {
//		return studentRollNo;
//	}
//
//	public void setAge(int age) {
//		studentAge = age;
//	}
//
//	public void setName(String newName) {
//		studentName = newName;
//	}
//
//	public void setRollNo(int rollNo) {
//		studentRollNo = rollNo;
//	}
//}
//
//public class assignment1 {
//
//	public static void main(String[] args) {
//		StudentEncapsulation studentEncapsulation = new StudentEncapsulation();
//		studentEncapsulation.setName("Sparshi");
//		studentEncapsulation.setAge(22);
//		studentEncapsulation.setRollNo(58);
//		// Displaying values of the variables
//		System.out.println("Student's Name: " + studentEncapsulation.getName());
//		System.out.println("Student's Age: " + studentEncapsulation.getAge());
//		System.out.println("Student's Roll No: " + studentEncapsulation.getRollNo());
//
//	}
//}



//Q3-) Create a thread named  fetch Data using thread  extend method
//Fetch data should  implement sleep method  with 5000ms time
//Create a thread named  process Data  using  runnable  interface
//Make sure process Data starts its execution only after fetch
//Data thread has completed its execution with the timeout of 10000ms

//class Fetch extends Thread {
//
//	public Fetch(String name) {
//		super(name);
//	}
//
//	@Override
//	public void run() {
//		System.out.println("MyThread - START " + Thread.currentThread().getName());
//		try {
//			fetchData();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("MyThread - END " + Thread.currentThread().getName());
//	}
//
//	private void fetchData() throws InterruptedException {
//		Thread.sleep(5000);
//	}
//
//}
//
//class Process implements Runnable {
//
//	@Override
//	public void run() {
//		System.out.println("Processing - START " + Thread.currentThread().getName());
//		try {
//			fetchData();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Processing - END " + Thread.currentThread().getName());
//	}
//
//	private void fetchData() throws InterruptedException {
//		Thread.sleep(5000);
//	}
//
//}
//
//public class assignment1 {
//
//	public static void main(String[] args) throws InterruptedException {
//		Thread t1 = new Fetch("FetchData");
//		System.out.println("Starting Fetch threads");
//		t1.start();
//		Thread.sleep(10000);
//		System.out.println("Runnable Threads has been started");
//		Thread t2 = new Thread(new Process(), ("ProcessData"));
//		System.out.println("Starting Process Threads");
//		t2.start();
//	}
//}



//Q4-) Create a resource called message 
//Message will have text as the field and isEmpty as the condition
//It has two synchronized functions read and write
//Create a writer thread that writes resource
//Create a reader thread that reads resource

//import java.util.Scanner;
//
//class SynchronizedMessage {
//	private String message = "";
//
//	public SynchronizedMessage() {
//		if (message.isEmpty()) {
//			this.message = "Message From Synchronized";
//		}
//	}
//
//	public synchronized String read() {
//		return message;
//	}
//
//	public synchronized String write(String newMessage) throws Exception {
//		if (newMessage.isEmpty()) {
//			throw new Exception("Entered message cannot be empty!!!");
//		}
//		this.message = newMessage;
//		return this.message;
//	}
//}
//
////reader thread that reads resource
//
//class ReadThread extends Thread {
//	private SynchronizedMessage t;
//
//	ReadThread(SynchronizedMessage t) {
//		this.t = t;
//	}
//
//	public void run() {
//		System.out.println(t.read());
//	}
//
//}
//
////writer thread that writes resource
//
//class WriteThread extends Thread {
//	private SynchronizedMessage t;
//	private String message;
//
//	WriteThread(SynchronizedMessage t, String message) {
//		this.t = t;
//		this.message = message;
//	}
//
//	public void run() {
//		try {
//			System.out.println(t.write(this.message));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
//
//
//public class assignment1 {
//
//	public static void main(String[] args) throws Exception {
//		SynchronizedMessage synchronizedMessage = new SynchronizedMessage();
//		Thread read = new ReadThread(synchronizedMessage);
//		System.out.println("Starting read thread:");
//		read.start();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a new message to write on Synchronized Variable through thread: ");
//		Thread write = new WriteThread(synchronizedMessage, sc.nextLine());
//		System.out.println("Starting write thread:");
//		write.start();
//		sc.close();
//	}
//}