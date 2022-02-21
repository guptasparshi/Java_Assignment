// ***Uncomment the code you want to execute.***


//Q1-) Write a Java Program to iterate HashMap using While and advance for loop.

//import java.security.KeyStore.Entry;
//import java.util.*;
//
//public class assignment3{
//    public static void main(String[] args){
//        Map<Integer, String> animals = new HashMap<Integer, String>();
//        animals.put(1, "Dog");
//        animals.put(2, "Rabbit");
//        animals.put(3, "Cat");
//        animals.put(4, "Tiger");
//        animals.put(5, "Horse");
//        animals.put(6, "Lion");
//
//
//        // Iterate using for loop
//        System.out.println("Iterate using advanced for loop");
//        for (Map.Entry<Integer, String> set : animals.entrySet()) {
//		    System.out.println("Key = " + set.getKey() + ", Value = " + set.getValue());
//		}
//
//        // Iterate using while loop
//        System.out.println("\nIterate using While loop");
//        Iterator <Integer> itr = animals.keySet().iterator();        
//        while(itr.hasNext()){
//            int key = (int)itr.next();
//            System.out.println("Key = " + key + ", Value = "+ animals.get(key));
//
//        }
//    }
//}



//Q2-) Write a Java Program to count the number of words in a string using HashMap.

//import java.util.HashMap;
//import java.util.*;
//import java.util.Scanner;
//
//public class assignment3 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        Map <String, Integer> map = new HashMap<>();
//        System.out.println("Enter a string");
//        String str = sc.nextLine(); // I can create program in java and i can write program in java and java is a programming language
//        
//        String [] words = str.split(" ");
//        for(String word:words){
//            word = word.toLowerCase();
//            Integer count = map.get(word);
//            if(count == null){
//                map.put(word, 1);
//            }
//            else{
//                map.put(word,count+1);
//            }
//        }
//        System.out.println(map);
//    }
//}



//Q3-) Write a Java Program to iterate Array List using for-loop, while-loop, and advance for-loop.

//import java.util.*;
//
//public class assignment3 {
//    public static void main(String[] args){
//        ArrayList <String> al = new ArrayList<String>();
//        al.add("Rose");
//        al.add("Lotus");
//        al.add("Lily");
//        al.add("Sunflower");
//        al.add("Daffodil");
//        al.add("Marigold");
//        al.add("Tulip");
//    
//     // Iterate using advanced for loop
//        System.out.println("Iterate using advanced for loop");
//        al.forEach((flower)->{
//            System.out.println(flower);
//        });
//          
//     // Iterate using while loop
//        System.out.println("\nIterate using while loop");
//        Iterator itr = al.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//      
//     // Iterate using for loop
//        System.out.println("\nIterate using for loop");
//        for(String flower:al){
//            System.out.println(flower);
//        }
//
//    }
//}



//Q4-) Write a Java Program to find the duplicate characters in a string.

//public class assignment3 {
//    public static void main(String[] args) {
//        int count;
//        String str = "My name is sparshi";
//        char[] str1 = str.toCharArray();
//        System.out.print("Duplicate characters in the string '"+str+"' are : ");
//        
//        for(int i = 0; i <str1.length; i++) {
//        count = 1;
//        for(int j = i+1; j <str1.length; j++) {
//        if(str1[i] == str1[j] && str1[i] != ' ') {
//        count++;
//        str1[j] = '0';
//            }
//        }
//        if(count > 1 && str1[i] != '0')
//        System.out.print(str1[i]+" ");
//        }      
//    }   
//}



//Q5-) Write a Java Program to find the second-highest number in an array.

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class assignment3 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array : ");
//        int n = sc.nextInt();
//        Integer [] arr = new Integer[n];
//        System.out.print("Enter elements of array: ");
//        for(int i=0 ; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println("Second highest elemet is "+ arr[1]);
//        
//     }
//}



//Q6-) Given  a  String,  find  the  first  repeated  character  in  it  using  Stream functions.

//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Optional;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class assignment3 {
// public static void main(String[] args) {
// String str = "apple";
// Map<Character, Long> collectString = str.chars()
//		 .mapToObj(i -> (char)i)
//		 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
// 
// Optional<Character> firstRepeat = collectString.entrySet()
// .stream()
// .filter( (e) -> e.getValue() > 1)
// .map(e -> e.getKey()).findFirst();
// 
// System.out.println("Repeated Character in string is '" + firstRepeat.orElse(null)+"'");
// }
//}



//Q7-) Given  a  String,  find  the first  non-repeated  character  in  it  using Stream functions.

//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Optional;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class assignment3 {
// public static void main(String[] args) {
// String str = "apple";
//
// Map<Character, Long> collect = str.chars()
// .mapToObj(i -> (char)i)
// .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
// 
// Optional<Character> firstNonRepeat = collect.entrySet()
// .stream()
// .filter( (e) -> e.getValue() == 1)
// .map(e -> e.getKey()).findFirst();
// 
// System.out.println("First non-repeated character is '" + firstNonRepeat.orElse(null)+"'");
// }
//}
