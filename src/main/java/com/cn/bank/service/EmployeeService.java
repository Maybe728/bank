package com.cn.bank.service;

import com.cn.bank.model.Bank;
import com.cn.bank.model.Employee;
import com.cn.bank.model.UpdateBankInfo;
import com.cn.bank.model.UpdateEmployeeInfo;

import java.util.List;

public interface EmployeeService {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee>  queryEmployeeInfos();

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
