/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo.dao;

import java.io.File;
import java.util.List;

/**
 * @author Holo
 * @date 2022/2/24 16:35
 */
public interface BaseDao<T> {

    //保存
    void save(T t, String table) throws Exception;

    //按照id查找文件
    File findById(T t, String table) throws Exception;

    //删除
    void delete(T t, String table) throws Exception;

    //更新
    void update(T t, String table) throws Exception;

    //显示
    List<T> findAll(Class aclass, String table);
}