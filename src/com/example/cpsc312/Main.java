package com.example.cpsc312; // must be the first executable line of code in file

import com.sprint.gina.MyOtherClass;

public class Main {
    public static void main(String[] args) {
        // package: grouping of related types (classes and interfaces)
        // why would you do this?
        // project structure (folder/file hierachy)
        // namespace management
        // access control

        // java.lang
        // java.util


        System.out.println(String.class.getPackageName());
        System.out.println(Main.class.getPackageName());

        // task: create a new package with a reverse domain name for your name
        // e.g. for me com.sprint.gina
        // print out a class package name here in main()
        System.out.println(MyOtherClass.class.getPackageName());
    }
}