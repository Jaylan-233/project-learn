package org.jaylan.mvcdemo.dao.impl;

import org.jaylan.mvcdemo.dao.DBDao;
import org.springframework.stereotype.Repository;

/**
 * 使用MySQl的dao类
 * 实现DBDao接口
 */
@Repository
public class MySQLDao implements DBDao {
    public void saveData()
    {
        System.out.println("数据保存到了MySQL中");
    }
}
