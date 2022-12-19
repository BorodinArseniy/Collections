import java.util.Objects;

public class Multiply {
    private int a;
    private int b;


    public Multiply(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public static void main(String[] args) {



    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multiply multiply = (Multiply) o;
        return a == multiply.a && b == multiply.b || b== multiply.a && a== multiply.b;
    }

    @Override
    public String toString() {
        return "Multiply{" +
                "a=" + a +
                ", b=" + b +
                ' ' + (a+b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
