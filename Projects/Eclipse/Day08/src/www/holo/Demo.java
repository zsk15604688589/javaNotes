//package www.holo;
//
//public class Demo {
//	public static void main(String[] args) {
//		Student student = new Student();
//		// 通过方法把外面的数据添加到对象的成员上
//		student.setAge(20);
//		// 通过方法吧成员的数据获取
//		int age = student.getAge();
//		System.out.println(age);
//	}
//}
//
//class Student {
//	// 学号
//	private int id;
//	// 姓名
//	private String name;
//	// 性别
//	private String sex;
//	// 地址
//	private String address;
//	// 年龄
//	private int age;
//
//	// 添加年龄
//	public void setAge(int nl) {
//		// 判断
//		if (nl > 0 && nl <= 300) {
//			age = nl;
//		} else {
//			System.out.println("请添加范围内的数字");
//		}
//	}
//
//	// 获取年龄
//	public int getAge() {
//		return age;
//	}
//}