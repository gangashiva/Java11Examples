package com.nantech;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Gangashiva");
    names.add("Rajesh");
    names.add("Chethan");

    List<String> copyOfNames = List.copyOf(names);

    //doNotChange(names);
    doNotChange(copyOfNames);
    //List.copyOf()
    //System.out.println(names );
    System.out.println(copyOfNames );

  }

  private static void doNotChange(List<String> names) {
    names.add("ShouldNotbeAllowed.!");
  }
}
