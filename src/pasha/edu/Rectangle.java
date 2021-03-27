package pasha.edu;

/*
@USER: Java02
@DATE: 27.03.2021
@NAME: Rectangle
*/
public class Rectangle implements IGeometry , IPacking{
    private int a;
    private int b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
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
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int getArea() {
        return a*b*2;
    }

    @Override
    public int getPerimeter() {
        return a*2+b*2;
    }

    /*
    <Rectangle>
     <a>this.getA</a>
     <b>this.getB</b>

     </Rectangle>



     */


    @Override
    public String toXml() {
        String xml = "<Rectangle>" + "\n" +
                "<a>" + this.getA() +
                "</a>" + "\n" +
                "<b>" + this.getB() +
                "</b>" + "\n" +
                "</Rectangle>";
        return xml;
    }

    /*
    var Rectangle{"a":3,"b":5}

     */

    @Override
    public String toJson() {
    String json = "Rectangle{" + "\"" +
            "a" + "\"" + ":" + this.getA() + "," +  "\"" + "b" + "\"" + ":" +this.getB() + "}";

        return json;
    }
}
