// ***Uncomment the code you want to execute.***


// 1-) Write a program that prints its arguments  in random order. Do not make  a copy of the argument array. 
// Demonstrate  how to print out the elements  using both streams  and the traditional enhanced for statement.

//import java.util.*;
//
//public class assignment2{
//
//	public static void main(String[] args) {
//
//		
//		List<Integer> argList = Arrays.asList(1,2,3,4,5,6,7);
//		System.out.println(argList);
//		Collections.shuffle(argList);
//
//		System.out.println("Printing elements using stream");
//		argList.stream().forEach(num -> System.out.println(num));
//
//		System.out.println("Printing elements using enhanced for each loop");
//		for (int num : argList) {
//			System.out.println(num);
//		}
//
//		System.out.println("Printing elements using traditional for loop");
//		for (int i = 0; i < argList.size(); i++) {
//			System.out.println(argList.get(i));
//		}
//		System.out.println();
//	}
//}



// 2-) Take  the FindDupsexample  and modify it to use  a SortedSet  instead of a Set. 
// Specify a Comparator so that case  is ignored when sorting and identifying set elements.

//import java.util.*;
//
//public class assignment2 {
//
//	static final Comparator<String> IGNORE_CASE_ORDER = new Comparator<String>() {
//		public int compare(String string1, String string2) {
//			return string1.compareToIgnoreCase(string2);
//		}
//	};
//
//	public static void main(String[] args) {
//
//		SortedSet<String> wordsFromArgs = new TreeSet<String>(IGNORE_CASE_ORDER);
//		String arr[] = {"Apple","Mango", "apple", "Papaya","Grapes","papaya"};
//		for (String newWord : arr) {
//			wordsFromArgs.add(newWord);
//		}
//		System.out.println(wordsFromArgs.size() + " distinct words: " + wordsFromArgs);
//	}
//}



// 3-) Write a method that takes  a List<String> and applies String.trimto each element.

//import java.util.Arrays;
//import java.util.List;
//import java.util.ListIterator;
//
//public class assignment2 {
//	static void listTrim(List<String> strings) {
//		for (ListIterator<String> lit = strings.listIterator(); lit.hasNext();) {
//			lit.set(lit.next().trim());
//		}
//	}
//
//	public static void main(String[] args) {
//		List<String> l = Arrays.asList(" red ", " white ", " blue ", " orange ", " green ");
//		listTrim(l);
//		for (String s : l) {
//			System.out.println(s);
//		}
//	}
//}



// 3-) Consider the four core interfaces, Set, List, Queue, and Map. 
// For each of the following four assignments, specify which of the four core interfaces is best-suited, 
// and explain how to use it to implement the assignment.
// 
// 1. Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every  month, an employee will be chosen at random from these records to receive a free toy.
// Answer: We will use List since collections has functionality to choose random item from the list.
//
// 2. WTI has decided that each new product will be named after an employee but only first names will be used, and each name will be used only once. Prepare a list of unique  first names.
// Answer: We will use Set because collections set has ability to take item only once.
//
// 3. WTI decides that it only wants to use  the most popular names  for its toys. Count up the number of employees who have each first name.
// Answer: We will use Map so that we can store key value pair to calculate count for each employee.
//
// 4. WTI acquires season tickets for the local lacrosse team, to be shared by employees. Create a waiting list for this popular sport.
// Answer: We will use Queue, so that we create a waiting list according to that we can use add() and remove() methods.
