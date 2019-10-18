package sk.itsovy.sestak.projectFragment;

public class Main {

    public static void main(String[] args) {
        Fragment f1=new Fragment(32, 48);
        System.out.println(f1.toString());
        f1.changeToBasicShape();
        System.out.println(f1.toString());
        f1.extendFragment(-5);
        System.out.println(f1.toString());
        System.out.println(f1.getRealValue());

        Fragment f2=new Fragment(7,28);
        f2.changeToBasicShape();
        System.out.println(f2.toString());
        System.out.println(f2.isFragmentInBasicShape());

        Fragment f3=new Fragment(7,0);

        Fragment f4= f2.copy();

        Fragment f5=new Fragment(f1);

        Rectangle rect=new Rectangle(12, 5);
        rect.setFill(true);
        rect.setCharacter('*');
        rect.showRec();


    }
}