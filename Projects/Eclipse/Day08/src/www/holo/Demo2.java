package www.holo;

public class Demo2 {
	public static void main(String[] args) {

		Student student = new Student();
		student.setName("张三");
		System.out.println();
	}
}

class Student {
	// 姓名
	private String name;

	public void setName(String name) {
		// 就把name参数的数值赋值给当前成员的成员变量了
		this.name = name;
	}
}