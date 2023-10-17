package day28_expentions;

import java.util.ArrayList;
import java.util.List;

public class C01_ChildOfInterfaces implements I01_InterfaceIstisnaDurumu {


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    public static void main(String[] args) {

        System.out.println(I01_InterfaceIstisnaDurumu.methodIStisna2()); // 44

        C01_ChildOfInterfaces obj = new C01_ChildOfInterfaces();
        obj.runnerMethod();// default istisnai method


        List<String> list = new ArrayList<>();

    }


    public void runnerMethod(){
        methodIstisna(); // Default istisnai method
    }
}
