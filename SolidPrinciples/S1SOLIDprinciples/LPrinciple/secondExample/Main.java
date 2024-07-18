package LLD.S1SOLIDprinciples.LPrinciple.secondExample;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        vehi v1=new car();
        vehi v2=new Bike();
        vehi v3=new bycycle();
        List<vehi>list=new ArrayList<>();
        list.add(v1); list.add(v2); list.add(v3);
        for(vehi lis:list){
            System.out.println(lis.engine().toString());
        }

    }
    
}
