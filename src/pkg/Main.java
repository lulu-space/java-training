package pkg;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Main { 

public static void main(String[] args) {
	// TODO Auto-generated method stub
	String javaVersion = System.getProperty("java.version");
	String javaHome = System.getProperty("java.home");
    String name = "Layan";

    System.out.println("Java Version: " + javaVersion);
    System.out.println("Java Installed At: " + javaHome);
    System.out.println("Name: " + name);
    
    Vehicle v1=new Vehicle();
    System.out.println("Default Vehicle: " + v1);
    System.out.println(v1.toString());

    v1.SetYear(2025);
    System.out.println("After setting year (private): " + v1.GetYear());
    
    
//Create a file
//Write text into it
//Read the text back
//Print it to console
    
    Path path = Path.of("data.txt");  //File will be created in same folder project.
    								//relative path
    try {
        // WRITE
        Files.writeString(path,
                "Java File I/O Example\n" +
                "Using NIO API\n" +
                "Name: Layan\n");

        // READ
        String content = Files.readString(path);

        System.out.println("File content:");
        System.out.println(content);         //print file content

    } catch (IOException e) {
        e.printStackTrace();
    }
    
}}
