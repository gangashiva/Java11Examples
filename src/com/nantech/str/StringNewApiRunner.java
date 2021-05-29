package com.nantech.str;

public class StringNewApiRunner {

  public static void main(String[] args) {
    System.out.println(" ".isBlank());
    System.out.println(" LR ".strip());
    System.out.println(" LR ".stripLeading());
    System.out.println(" LR ".stripTrailing());
    System.out.println(" LR ".strip().replace(" ","@"));
    System.out.println(" LR ".stripLeading().replace(" ","@"));
    System.out.println(" LR ".stripTrailing().replace(" ","@"));
    "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
    //System.out.println("UPPER".transform(s -> s.substring(2))); //Java-12   //PER
    //System.out.println("My Name is %s. My age is %d.".formatted("Gangashiva",25)); //Java-13 //Gangashiva. 25

    String str = null;
    //System.out.println(str.isBlank());
    //System.out.println(OtrherClass.str.isBlank());  //Java-14
    //Exception in thread "main" java.lang.NullPointerException
    //at com.nantech.str.StringNewApiRunner.main(StringNewApiRunner.java:18)

  }

}
