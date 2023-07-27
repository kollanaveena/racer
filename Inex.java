import java.io.*;
interface A
{
void msg1();
}
interface B
{
void msg2();
}
class In implements A,B
{
public void msg1()
{
System.out.println("iam method of interface A");
}
public void msg2()
{
System.out.println("iam method of interface B");
}
}
class Inex
{
public static void main(String args[])
{
In obj=new In();
obj.msg1();
obj.msg2();
}
}