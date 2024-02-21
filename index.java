class A
{
    public int add(int n1, int n2)
    {
        return n1 + n2 + 8;
    }
}
class B extends A
{
    public int add(int n1, int n2)
    {
        return n1 - n2;
    }
}
class C extends A
{
    public int add(int n1, int n2)
    {
        return n1 * n2;
    }
    
}
public class index 
{
public static void main(String[] args) 
{
   A obj = new C();
   int r1 = obj.add(6, 4);
   System.out.println(r1);     
}  
}