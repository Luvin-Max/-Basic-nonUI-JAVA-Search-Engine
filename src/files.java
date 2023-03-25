import java.io.*;
import java.util.Scanner;

public class files {

public static void main(String arg[])
{
System.out.println("Enter a path to check for file or directory");
Scanner obj=new Scanner(System.in);
String path=obj.next();
File obj1=new File(path);
if(obj1.isFile())
{
System.out.println("Entered path is a File");
}
else if(obj1.isDirectory())
{
System.out.println("Entered path is a Directory or Folder");
}
else
{
System.out.println("You have entered a wrong path");
}
}
}


