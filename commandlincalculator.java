import java.util.Scanner;
public class calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("command-line calculator");
System.out.println("1.addition");
System.out.println("2.substraction");
System.out.println("3.multiplication");
System.out.println("4.division");
System.out.println("5.Quit");
System.out.println("enter the command line number to perform the operation(1/2/3/4/5):");
int choice =Scanner.nextInt();
if(choice>=1 && choice<=4)
{
System.out.println("enter the first number");
double num1=Scanner.nextDouble();
System.out.println("enter the second number");
double num2=Scanner.nextDouble();
switch(choice)
{
case 1:
 System.out.println(num1 + "+" + num2  + "=" +(num1+num2));
break;
case 2:
System.out.println(num1 + "-"  + num2  + "=" +(num1-num2));
break;
case 3:
System.out.println(num1 +  "*" + num2 + "=" +(num1*num2));
break;
case4:
System.out.println(num1 + "/" + num2 +  "="+(num1/num2));
break;
default:
System.out.println("invalid operation");
}
}
else
{
      System.out.println("quit of code");
}
}
Scanner.close();
}
}






