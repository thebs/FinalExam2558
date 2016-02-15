package FinalExam1;

public class Exam1 {
    public static void main(String[] args){
        int n = 30;
        Foo f = new Foo();
        Boo b = new Boo();
        System.out.println("=1=");
        f.dip(3,n);
        System.out.println("=2=");
        b.dip(3,n);
        System.out.println("=3=");
        show(b,2,"abcde");
        show(b,3,"123456789");
    }
    
    public static void show(Cal m, int a, String s){
        m.calculate(a,s);
    }
}
