class Overload
{
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}
class Call
{
    public static void main (String args [])
    {
        Overload Obj = new Overload();
        double result;
        Obj.demo(10);
        result = Obj.demo(10.0);
        System.out.println("Urgent call " + result);
		System.out.println("Name=Harsh Sandhu");
		System.out.println("Roll no= 65");
    }
}