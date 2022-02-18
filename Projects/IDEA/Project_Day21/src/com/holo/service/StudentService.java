/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo.service;

import com.holo.domain.Student;
import java.util.List;

/**
 * @author Holo
 * @date 2022/2/16 17:14
 */
public interface StudentService {
    //添加学生
    void save(Student student);

    //显示学生
    List findAll();

    //按照id查找学生
    Student findById(String id);

    //更新学生
    void update(Student student);

    //删除学生
    void delete(String id);
}