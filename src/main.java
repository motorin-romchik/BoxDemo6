class Box {
    double width;
    double height;
    double depth;

    Box(){
        System.out.println("Работа конструктора");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume (){
        return width * height * depth;
    }
}
public class main {
    public static void main (String args[]){
        Box mybox1 = new Box ();
        Box mybox2 = new Box ();

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volume();
        System.out.println("ОБьем равен "+ vol);
    }
}
