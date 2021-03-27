package pasha.edu;

public class Main {

    public static void main(String[] args) {
Rectangle r1 = new Rectangle(3 ,4);
IGeometry r2 = new Rectangle(5,6);
RightTrianlge t1 = new RightTrianlge(3,4);
IGeometry t2 = new RightTrianlge(5,6);
IGeometry[] array = new IGeometry[4];
array[0] = r1;
array[1] = r2;
array[2] = t1;
array[3] = t2;

        System.out.println(r1.toXml());
        System.out.println(r1.toJson());

        /*
        Rectangle
         */

        Table javaTable = new Table(5,6 , "white","wood" , "white" , true , true );
        System.out.println(javaTable.getPrice());
    }
}
