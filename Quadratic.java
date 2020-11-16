public class Quadratic {
    public static void main(String[] args){
        //parse co-efficient from command line
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        // calculate roots of x*x + b*x + c
        double discriminant = b*b - 4.0*c;
        double d = Math.sqrt(discriminant);
        double root1 = (-b + d) / 2;
        double root2 = (-b - d) / 2;

        //print them
        System.out.println(root1);
        System.out.println(root2);
    }
}
