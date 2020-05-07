import java.util.Scanner;
public class ShiYan_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _int = 34;
        double _double = 3.14;
        boolean _bool = true;
        String _String = "I love java";
        System.out.println("int="+_int+"\ndouble="+_double);
        System.out.println("boolean="+_bool+"\nString="+_String);
        System.out.println("=======================");
        _int = in.nextInt();
        _double = in.nextDouble();
        _bool = in.nextBoolean();
        in.nextLine();//读取换行符
        _String =  in.nextLine();
        System.out.println("=======================");
        System.out.println("int="+_int+"\ndouble="+_double);
        System.out.println("boolean="+_bool+"\nString="+_String);
    }
}
