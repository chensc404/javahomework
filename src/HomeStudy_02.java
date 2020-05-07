public class HomeStudy_02 {
    public static void main(String[] args) {
        String s="0",s2="4";
        int i=1,j=2;
        System.out.println(s+i+j);		//① 012
        System.out.println(i+j+s);		//② 30
        System.out.println(s+(i+j));	//③ 03
        System.out.println((s+i)+j);	//④ 012
        System.out.println(i+s2);		//⑤ 14
        System.out.println(s2+i);		//⑥ 41
        System.out.println("============");
//        int num1=20%6;		//① 3
//        int num2=20%-6;		//② -3
//        int num3=-20%6;		//③ -3
//        int num4=-20%-6;	//④ 3

        int num1=20;
        num1++;			//①
        double num2=3.14;
        num2++;
        int count=10;
        int num=count+++count++;
        System.out.println(num);
//        System.out.println(num1);		//① 012
//        System.out.println(num2);		//② 30
//        System.out.println(num3);	//③ 03
//        System.out.println(num4);
//

    }
}
