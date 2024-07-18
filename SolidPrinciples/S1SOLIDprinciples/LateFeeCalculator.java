package LLD.S1SOLIDprinciples;
public class LateFeeCalculator {
    //Interface rather than concreate class =>Dependency inversion  principle
    public double calculateLateFee(LateFeeCalculation item[],int days){
        double t=0;
        for(LateFeeCalculation i:item){
            t+=i.calculateLatefee(days);
        }
        return t;
    }
}
