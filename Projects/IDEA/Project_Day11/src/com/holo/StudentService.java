package com.holo;

//业务类
public class StudentService {
    //依赖数据库
    private static Student[] array = DataBaseHolo.getInstance().getStudents();

    /**
     * TODO 获取对应学生下标
     *
     * @param sid 学号
     * @return 学生下标
     */
    public static int findById(int sid) {
        for (int index = 0; index < array.length; index++) {
            //根据下标获取对应的学生对象
            Student student = array[index];
            //判断是否存在
            if (sid == 0) {
                if (student == null) return index;
            } else {
                if (student != null && sid == student.getId()) return index;
            }
        }
        return -1;
    }

    /**
     * TODO 保存学生信息
     *
     * @param student 学生对象(地址)
     */
    //保存学生
    public static void save(Student student) {
        //获取一个空位置
        if (student != null) {
            int index = findById(0);
            if (index != -1) {
                array[index] = student;
                System.out.println("保存成功");
            } else {
                System.out.println("满了");
            }

        } else {
            System.out.println("请添加学生信息");
        }

    }

    /**
     * TODO 查找学生
     * @param id 学生id
     * @return 学生
     */
    //查找学生
    public Student findByStu(int id) {
        int index = findById(id);
        //判断
        if (index != -1) {
            return array[index];
        } else {
            return null;
        }
    }

    //删除学生
    public void delete(int id) {
        int index = findById(id);
        //判断
        if (index != -1) {
            array[index] = null;
        } else {
            System.out.println("查无此学生");
        }
    }

    //更新学生
    public void update(Student student) {
        if (student != null) {
            int index = findById(student.getId());
            //判断
            if (index != -1) {
                array[index] = student;
            } else {
                System.out.println("查无此学生");
            }
        } else {
            System.out.println("请输入学生信息");
        }
    }

    //显示学生
    public void findAll() {
        //加强for循环
        for (Student student : array) {
            if (student != null) {
                System.out.println("id=" + student.getId() +
                        "\t username=" + student.getUsername() +
                        "\t sex=" + student.getSex() +
                        "\t age=" + student.getAge());
            }
        }
    }
}