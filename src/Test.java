public class Test {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(0,1,1);
        } catch (IllegalArgumentException i){
            System.out.println( "Invalid input ");
        }

        Triangle triangle = new Triangle(1,1,1);

        System.out.println(triangle);


    }
}
