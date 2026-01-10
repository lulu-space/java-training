package pkg;

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

    FileService fileService = new FileService("data.txt");
    try {
        fileService.writeToFile("Name: Layan");
        fileService.writeToFile("Java Version: " + System.getProperty("java.version"));
        fileService.writeToFile("Java Home: " + System.getProperty("java.home"));
        System.out.println("File content:");
        System.out.println(fileService.readFromFile());

    } catch (IOException e) {
        System.out.println("File operation failed: " + e.getMessage());
    }

}}
