public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getType(){

        // checks if the trianlge is valid,
        // by checking that the to shorter sides are not shorter than or equal to the longest side
        if (a < c && b < c && c >= a+b) return "Invalid";
        if (b < a && c < a && a >= c+b) return "Invalid";
        if (a < b && c < b && b >= a+c) return "Invalid";

        if(a == b && b == c){
            return "equilateral";
        }else if (a == b || b == c || c == a){ // since we have already checked for equality for all three sides, we only need to check if one side equals another
            return "isosceles";
        } else { // finally, since the condition above are not true, it must mean that none of the sides are the same length
            return "scalene";
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", triangleType=" + getType() +
                '}';
    }
}
