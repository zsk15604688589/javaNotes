package www.holo;

public class Demo2 {
	public static void main(String[] args) {

		Student student = new Student();
		student.setName("����");
		System.out.println();
	}
}

class Student {
	// ����
	private String name;

	public void setName(String name) {
		// �Ͱ�name��������ֵ��ֵ����ǰ��Ա�ĳ�Ա������
		this.name = name;
	}
}