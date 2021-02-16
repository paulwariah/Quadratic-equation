import  java.util.Scanner;
public class QuadraticEquation {
     public static void main (String[] args) {
         Double c;
         Double a;
         Double b;
         Double discriminant;
         Double root1;
         Double root2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = scanner.nextDouble();

        System.out.println("Enter value of b: ");
         b = scanner.nextDouble();
         
        System.out.println("Enter value of c: ");
         c = scanner.nextDouble();
        
        discriminant = Math.pow(b, 2)-4*a*c;
        if(discriminant >=0){
            root1 = (-b + Math.sqrt(discriminant))/(2*a);
            root2 = (b + Math.sqrt(discriminant))/(2*a);
            if(root1==root2){
                System.out.println("The roots are equal");
             System.out.println("The value is: " +root1);
           }
              else{
                System.out.println("Root1 is: "+root1);
                System.out.println("Root2 is: "+root2);
            }
        }
             else if(discriminant < 0){
               System.out.println("There are no real roots");
   }
  }
}
    