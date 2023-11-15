package methodhomework;

public class Staticnotstaticmethodhw {

    void myMethod(){
        System.out.println("nonstatic method");
    }
    static void myMethod(int x){
        System.out.println("static Method");
    }

    public static void main(String[] args) {
        Staticnotstaticmethodhw OBJ = new Staticnotstaticmethodhw();
        OBJ.myMethod();
        OBJ.myMethod(25);

        {


        }
    }
    }