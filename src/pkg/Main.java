package pkg;

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
}}
