 class A
{
public void funA1()
{
System.out.print("funA1 called from class A");
}
public void funA2()
{
System.out.print("funA2 called from class A");
}
}
class B
{
public static void main(String args[]){
A ob=new A();
ob.funA1();
ob.funA2();
}
}


