import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HomeStudy_03 {
    static class getIt{
        public void getPI(int n){
            int sign = 1;
            double sum = 0;
            for(int i = 1;i <= 2*n+1;i+=2){
                sum+=sign*(1.0/i);
                sign=-sign;
            }
            sum*=4;
            System.out.println("n="+n+"    Π="+sum);
        }
    }
    public static void main(String[] args) {
        getIt suan = new getIt();
        suan.getPI(1000);
        suan.getPI(10000);
        suan.getPI(100000);




//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int sum = 1;
//        System.out.print("请输入两个数a:");
//        int a = in.nextInt();
//        System.out.print("请输入两个数b:");
//        int b = in.nextInt();
//        for(int i = 2;i<=Math.min(a,b);i++){
//            if(a%i==0&&b%i==0){
//                sum*=i;
//                a/=i;
//                b/=i;
//            }
//    }
//        System.out.println(sum);
//






//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("请输入数字：");
//        int num = in.nextInt();
//        int sum = 0;
//        while(num > 0){
//            sum+=num%10;
//            num/=10;
//         }
//        System.out.println(sum);
//











//    public static class Cmp{   //比较类
//        int x;
//        public Cmp(int x){
//            this.x = x;
//        }
//        public boolean letscmp(int a){  //比较方法
//            boolean ret;
//            if(x==2){
//                ret = a == 1;
//            }else if(x==1){
//                ret = a == 0;
//            }else {
//                ret = a == 2;
//            }
//            return ret;
//        }
//    }
//    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        int rNum = (int) (Math.random()*10%3);
//        System.out.println("random="+rNum);
//        Cmp cmpNum = new Cmp(rNum);
//        Scanner in = new Scanner(System.in);
//        map.put(2,"石头");
//        map.put(1,"剪刀");
//        map.put(0,"布");
//        System.out.println("来石头剪刀布（2：石头 1：剪刀 0：布）");
//        int playerNum = in.nextInt();
//        if(cmpNum.x==playerNum){
//            System.out.println("打个平手!电脑出："+map.get(rNum)+"    你出："+map.get(playerNum));
//        }
//        else {
//            if(cmpNum.letscmp(playerNum))
//                System.out.println("电脑赢了！电脑出："+map.get(rNum)+"    你出："+map.get(playerNum));
//            else
//                System.out.println("你赢了！电脑出："+map.get(rNum)+"    你出："+map.get(playerNum));
//        }

//        Scanner in = new Scanner(System.in);
//        int scores;
//        System.out.println("Please input your scores:");
//        scores = in.nextInt();
//        switch (scores/10){
//            case 10: case 9: case 8:
//                System.out.println("You got A");break;
//            case 7: case 6:
//                System.out.println("You got B");break;
//            case 5: case 4:
//                System.out.println("You got C");break;
//            case 3: case 2:
//                System.out.println("You got D");break;
//            case 1: case 0:
//                System.out.println("You got E");break;
//        }







//        int a,b,c;
//        double x1,x2;
//        Scanner in = new Scanner(System.in);
//        System.out.println("请输入a的值");
//        a = in.nextInt();
//        System.out.println("请输入b的值");
//        b = in.nextInt();
//        System.out.println("请输入c的值");
//        c = in.nextInt();
//        double sqrt = Math.sqrt(b * b - 4 * a * c);
//        x1 = (-b+ sqrt)/(2*a);
//        x2 = (-b- sqrt)/(2*a);
//        System.out.println("x1="+x1);
//        System.out.println("x2="+x2);
    }
}
