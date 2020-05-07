/*
 * @陈少川
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class ShiYan_01 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat( "0.00 ");
        double r = 0.00,h = 0.00;
        double s = 0.00,v = 0.00;
        System.out.print("请输入圆柱体的高：");
        h = g.nextDouble();//@陈少川
        System.out.print("请输入圆柱体的底面半径：");
        r = g.nextDouble();//@陈少川
        s = Math.PI*r*r*2 + Math.PI*r*2*h;
        v = Math.PI*r*r*h;//@陈少川
        System.out.println("经计算，圆柱体的表面积为："+ df.format(s)+",体积为："+df.format(v));
    }
}
