public class Klasse2 extends Klasse1{

    int k = 2;
    int i = 8;

    Klasse2(){
        super(5);
        System.out.println("k2 -> " + this.i + ", k1 -> " + super.i);
    }

    void doStuff(){
        test();
        super.test();
    }

}
