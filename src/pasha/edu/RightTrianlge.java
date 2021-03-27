package pasha.edu;

/*
@USER: Java02
@DATE: 27.03.2021
@NAME: RightTrianlge
*/
public class RightTrianlge implements  IGeometry{
    private int a;
    private int b;

    public RightTrianlge() {
    }

    public RightTrianlge(int a, int b) {
        this.a = a;
        this.b = b;
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
    public String toString() {
        return "RightTrianlge{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int getArea() {
        return a*b / 2;
    }

    @Override
    public int getPerimeter() {
        return (int) (a+b+Math.sqrt(a*a+b*b));
    }

    @Override
    public String toXml() {
        String xml = "<RightTrianlge>" + "\n" +
                "<a>" + this.getA() +
                "</a>" + "\n" +
                "<b>" + this.getB() +
                "</b>" + "\n" +
                "</RightTrianlge>";
        return xml;
    }

    @Override
    public String toJson() {
        String json = "RightTrianlge{" + "\"" +
                "a" + "\"" + ":" + this.getA() + "," +  "\"" + "b" + "\"" + ":" +this.getB() + "}";

        return json;
    }
}
