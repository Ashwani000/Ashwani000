import java.util.*;
public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter choice");
        int n = sc.nextInt();
        switch(n){
            case 1:
            int c = a+b;
            System.out.println("sum"+c);break;
            case 2: int d = a-b;
            System.out.println("diff"+d);break;
        
            case 3: int e =a*b;
            System.out.println("product"+e);break;
            case 4: int f =a/b;
            System.out.println("divide"+f);break;
           /* case 5:
            System.out.println();break;
            case 6:
            System.out.println();break;
            case 1:
            System.out.println();break;
            case 1:
            System.out.println();break;
            case 1:
            System.out.println();break;*/
 }
}
}