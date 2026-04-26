package org.example;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Student student=new Student();
        student.setAge(23);
        System.out.println(student.getAge());
        System.out.println(student.toString());
    }
}
