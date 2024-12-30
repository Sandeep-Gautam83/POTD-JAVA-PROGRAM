public class OverloadedMethod
{
    public static void main(String[] args) {
      OverloadedMethod obj = new OverloadedMethod();
        System.out.println("Largest two number : " +obj.max(10,2));
        System.out.println("Largest three number : " +obj.max(10,20,2));
        System.out.println("Largest four number : "+obj.max(10,200,30,45));
    }

    public int max(int a, int b){
        int r;
        if(a>b)
            return a;
        else
            return b;
    }
    public  int max(int a,int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    public int max(int a,int b, int c , int d){
        return max(a,b,c)>d ? max(a,b,c) : d;
    }

}
