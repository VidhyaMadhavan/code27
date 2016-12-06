import java.util.*;
class occur
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter size of string:");
n=sc.nextInt();
String s[]=new String[n];
System.out.println("Enter strings:");
for(int i=0;i<n;i++)
{
s[i]=sc.next();
}
for(int i=0;i<n;i++)
{
if(s[i].length()==1)
{
System.out.println(s[i]);
break;
}
else
continue;
}
}
}
