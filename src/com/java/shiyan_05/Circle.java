package com.java.shiyan_05;
public class Circle {
		public static final double Pi = 3.14;
		private double r;
		/*setter、getter*/
		public double getR() {
			return r;
		}
		public void setR(double r) {
			this.r = r;
		}
		/*添加有参构造方法*/
		public Circle(double r){
			this.r = r;
		}
		public Circle(){

		}
}
