package com.java.shiyan_05;
public class Rectangle {
		private static  int count;      //用来递增记录对象的编号并传给ID
		private double width;
		private double length;
		private  String  ID;
		/*初始化设置静态属性count的值*/
		static {
			count = 0;
		}
		/*默认无参的构造方法*/
		public Rectangle(){
			this.ID = String.valueOf(String.format("%04d",++count));
		}
		/*有参的构造方法*/
		public Rectangle(double length , double widith){
			this.ID = String.valueOf(String.format("%04d",++count));
			this.length = length;
			this.width = widith;
		}
		/*getter、setter*/
		public double getWidith() {
			return width;
		}
		public void setWidith(double widith) {
			this.width = widith;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}

		/*获取面积和周长的方法*/
		public double getArea(){
			return this.length * this.width;
		}
		public double getPerimeter(){
			return (this.length + this.width) * 2;
		}

		@Override
		public String toString() {
			return this.ID + "|width:" + this.width + "|length:" + this.length
					+ "|area:" + this.getArea() + "|perimeter:" + this.getPerimeter();
		}
	}

