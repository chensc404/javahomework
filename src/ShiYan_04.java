import java.util.Arrays;
import java.util.Scanner;
public class ShiYan_04 {
        public static void main(String[] args) {


//            int i,j;
//            int N =2019;
//            int sum =0;
//            boolean [] u = new boolean[N+1];
//            Arrays.fill(u,true);
//            int [] su = new int[N+1];
//            int len =0;
//            for(i=2;i<=N;i++) {
//                if(u[i]) su[++len]=i;
//                for(j=1;j<=len;j++) {
//                    if(i*su[j]>N) break;
//                    u[i*su[j]]=false;
//                    if(i%su[j]==0) break;
//                }
//            }
//            for (int i1 = 1; i1 <= N; i1++) {
//                if(u[i1]) sum+=su[i1];
//            }
//            System.out.println(sum);
//            Scanner in = new Scanner(System.in);
//            System.out.println("Please input the number：");
//            int num = in.nextInt();
//            int sum = 0;
//            while (num > 0) {
//                sum += num % 10;
//                num /= 10;
//            }
//            System.out.println(sum);

        }

//    public static void main(String[] args) {
//        double sum = 0.0;
//        for (int i = 1; i < 2019; i++) {
//            sum += i / (i + 1.0);
//        }
//        System.out.println("The sum is:" + sum);
//
////
//
//
//    }
//        int i = 1;
//        while (i < 10){
//            int j = 1;
//            while(j <= i){
//                System.out.print(j + "x" + i +"="+ i*j + "\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//
//public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <= i;j++) {
//                System.out.print(j + "x" + i +"="+ i*j + "\t");
//            }
//            System.out.println();
//        }
//    }
//
//}






//
//    /**
//     *五分制输出十分制成绩（switch实现）
//     */
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int scores;
//        System.out.println("Please input your scores:");
//        scores = in.nextInt();
//        switch (scores / 10){
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
//    }



//
//    /**
//     *五分制输出十分制成绩（if实现）
//     */
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please input your score:");
//        int score = in.nextInt();
//        char scoreFinal = '0';
//        if(score < 0 || score > 100){
//            System.out.println("Error");
//            System.exit(0);
//        }else {
//            if(score >= 80) scoreFinal = 'A';
//            else if(score >= 60) scoreFinal = 'B';
//            else if(score >= 40) scoreFinal = 'C';
//            else if(score >= 20) scoreFinal = 'D';
//            else scoreFinal = 'E';
//        }
//        System.out.println("Your final score is:" + scoreFinal);
    //}

}
