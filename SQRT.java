public class SQRT {
    public static void main(String[] args){
        double error = 1E-15;
        double c = Math.abs(Double.parseDouble(args[0]));
        double t = c;
        while(Math.abs(t - c/t) > t*error){
            t = (c/t + t) / 2;
        }
        System.out.println(t);
    }
}
