/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo.dao;

import com.holo.domain.Student;

import java.io.File;

/**
 * @author Holo
 * @date 2022/2/23 15:00
 */
public interface StudentDao {
    //保存
    void save(Student student);

    //显示数据
    void findAll();

    //按照id查找文件
    File findById(String id);

    //删除数据：就是删除对应的文件
    void delete(String id);

    //更新数据文件
    void update(Student student);
}