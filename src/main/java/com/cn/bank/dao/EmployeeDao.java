package com.cn.bank.dao;

import com.cn.bank.model.Employee;
import com.cn.bank.model.UpdateEmployeeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeDao {
    /**
     * 查询所有员工的信息
     * @return
     */
    List<Employee> queryEmployeeInfos();

    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    int addEmployeeInfo(Employee employee);

    /**
     * 更新员工信息
     * @param updateEmployeeInfo
     * @return
     */
    int editEmployeeInfo(UpdateEmployeeInfo updateEmployeeInfo);

    /**
     * 删除员工信息
     * @param updateEmployeeInfo
     * @return
     */
    int delEmployeeInfo(UpdateEmployeeInfo updateEmployeeInfo);
}
