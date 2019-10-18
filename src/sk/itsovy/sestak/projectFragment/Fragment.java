package sk.itsovy.sestak.projectFragment;

public class Fragment {
    private int numerator;
    private int denominator;

    public Fragment(int numerator, int denominator) {
        if(denominator==0)
            denominator=1;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fragment (Fragment otherFragment){
        numerator=otherFragment.getNumerator();
        denominator=otherFragment.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void changeToBasicShape(){
        int commonDividisor=getTheLargestCommonDivisor();
        numerator=numerator/commonDividisor;
        denominator=denominator/commonDividisor;
    }

    public void extendFragment(int value){
        if(value!=0){
            numerator*=value;
            denominator*=value;
        }
    }
    public double getRealValue(){
        return (double)numerator/denominator;
    }

    public void reverse(){
        int temp=numerator;
        numerator=denominator;
        denominator=temp;
    }
    public void opposite(){
        numerator*=-1;
    }

    public Fragment copy(){
        Fragment newFragment=new Fragment(numerator, denominator);
        return newFragment;
    }

    private int getTheLargestCommonDivisor(){
        /* if(numerator<denominator)
              commonDivisor=numerator;
           else
              commonDivisor=denominator;  */

        // namiesto if pouzijem ternarny operator
        int absNumerator=Math.abs(numerator);
        int absDenominator=Math.abs(denominator);

        int commonDivisor=absNumerator<absDenominator?absNumerator:absDenominator;
        while (absNumerator % commonDivisor != 0 || absDenominator%commonDivisor != 0) {
            commonDivisor--;
        }
        return commonDivisor;
    }

    public boolean isFragmentInBasicShape(){
        if(getTheLargestCommonDivisor()==1){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString(){
        return numerator+" / "+denominator;
    }
}
