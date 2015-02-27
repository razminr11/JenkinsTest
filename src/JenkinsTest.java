import java.awt.*;
import java.io.*;
import java.util.*;

public class JenkinsTest
{
	public static Scanner uin = new Scanner(System.in);
	
	public static String input;
	
	public static void main(String[] args)
	{
		start();
	}
	
	public static void start()
	{
		System.out.println("This is a test class.");
		
		System.out.println("Enter your name: ");
		
		input = uin.next();
		
		System.out.println("Hi "+uin);
	}
}