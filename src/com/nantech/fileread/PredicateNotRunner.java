package com.nantech.fileread;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

  public static boolean isEven(Integer number){
    return number%2==0;
  }

  public static void main(String[] args) {
    List<Integer> numbres = List.of(3,4,5,67,89,88);
    //Predicate<Integer> evenNumberpredicate = numbrer -> numbrer%2==0;
    //numbres.stream().filter(evenNumberpredicate).forEach(System.out::println);
    //numbres.stream().filter(evenNumberpredicate.negate()).forEach(System.out::println);
    numbres.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
    numbres.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);

  }

}
