package pasha.edu;

/*
@USER: Java02
@DATE: 27.03.2021
@NAME: Table
*/
public class Table extends Rectangle{
    private String color;
    private String material;
    private String tableType;
    private Boolean isDecorated;
    private Boolean isLacquered;
    private final int pricePerSquareMetr = 100;

    public Table() {
    }

    public Table(String color, String material, String tableType, Boolean isDecorated, Boolean isLacquered) {
        this.color = color;
        this.material = material;
        this.tableType = tableType;
        this.isDecorated = isDecorated;
        this.isLacquered = isLacquered;
    }

    public Table(int a, int b, String color, String material, String tableType, Boolean isDecorated, Boolean isLacquered) {
        super(a, b);
        this.color = color;
        this.material = material;
        this.tableType = tableType;
        this.isDecorated = isDecorated;
        this.isLacquered = isLacquered;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public Boolean getDecorated() {
        return isDecorated;
    }

    public void setDecorated(Boolean decorated) {
        isDecorated = decorated;
    }

    public Boolean getLacquered() {
        return isLacquered;
    }

    public void setLacquered(Boolean lacquered) {
        isLacquered = lacquered;
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", tableType='" + tableType + '\'' +
                ", isDecorated=" + isDecorated +
                ", isLacquered=" + isLacquered +
                '}';
    }

    public int getPrice(){
        int price = super.getArea() * pricePerSquareMetr;
        if (this.getMaterial().equals("wood")){
            price = price * 2;
        }
        if (this.getLacquered()== true){
            price = price + 500;
        }
        if (this.getColor().equals("white")){
            price = price * 2;
        }
        if (this.getTableType().equals("computer")){
            price = price * 4;
        }


        return price;
    }

}
