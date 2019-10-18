package sk.itsovy.sestak.projectFragment;

class MyMath {

    public Fragment add(Fragment a, Fragment b){
        Fragment result=null;
        result=
                new Fragment(a.getNumerator()*b.getDenominator()+a.getDenominator()*b.getNumerator(), a.getDenominator()*b.getDenominator());

        result.changeToBasicShape();
        return result;
    }
    public Fragment sub(Fragment a, Fragment b){
        Fragment result=null;
        result=
                new Fragment(a.getNumerator()*b.getDenominator()+a.getDenominator()*b.getNumerator(), a.getDenominator()*b.getDenominator());

        result.changeToBasicShape();
        return result;
    }/*
    public Fragment null(int value, Fragment b){
        Fragment result=null;
        result=
*/
    }/*
    public MixedNumber getMixedNumber(){
        return new
    }*/
