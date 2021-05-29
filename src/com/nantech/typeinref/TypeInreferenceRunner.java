package com.nantech.typeinref;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TypeInreferenceRunner {

  //Java 10 feature
  public static void main(String[] args) {
     List<String> names1 = List.of("Gangashiva", "Raju");
     List<String> names2 = List.of("Badri", "Siddu");
     //List<List<String>> names = List.of(names1, names2);
     final var names = List.of(names1, names2);
     //List<String> numbers = new ArrayList<>();
     var numbers = new ArrayList<>();
     //var abc = null; //null assign is not possible
     var var = "";
    names.stream().forEach(System.out::println);

    for (int i=1; i<=10; i++){
      System.out.println(i);
    }

    for (String name: names1
         ) {
      System.out.println(name);
    }

    for (var i=1; i<=10; i++){
      System.out.println("var: "+i);
    }

    for (var name: names1
    ) {
      System.out.println("var: "+name);
    }
    //List.of("Gangashiva","Ravi").stream().filter(s -> s.length()<5).forEach(System.out::println);
    var filter = List.of("Gangashiva", "Ravi").stream().filter(s -> s.length() < 5);
    filter.forEach(System.out::println);
  }

}
//Java compiler infers the type of the variable at compile time
//Introduced in java 10
//You can add final if you want
//var can also be used in loops

//Remember:
          //You cannot assign null
          //var is not a keyword
//Best Practices:
  //Good variable names
  //Minimize scope
  //Improve readability for chained expressions

//JAVA 14
//SwitchExpression

/*
public static String findDayOfTheWeekWithSwitchExpression(int day){
  String dayOfWeek = switch(day){
    case 0 -> {
    System.out.println("Do some complex logic here ");
    yield "Sunday";
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    default -> throw new IllegalAccessException("Invalid Option: "+day)
  };
  return dayOfWeek;
}*/

// JAVA 16
//POJO's not required  constructor, setter's & getters, toString and hashCode
/*
record Person(String name, String email, String phoneNumber){
  Person{
    if (name == null)
      throw new IllegalArgumentException("name cannot be null");
  }
}
*/
