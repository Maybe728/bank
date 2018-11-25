package com.cn.bank.serviceImpl;

import com.cn.bank.dao.BankDao;
import com.cn.bank.dao.EmployeeDao;
import com.cn.bank.model.Bank;
import com.cn.bank.model.Employee;
import com.cn.bank.model.UpdateBankInfo;
import com.cn.bank.model.UpdateEmployeeInfo;
import com.cn.bank.service.BankService;
import com.cn.bank.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;
    @Override
    public List<Employee> queryEmployeeInfos(Bank bank) {
        return employeeDao.queryEmployeeInfos(bank);
    }

    /**
     * 添加员工信息
     *
     * @param employee
     * @return
     */
    @Override
    public int addEmployeeInfo(Employee employee) {
        int result = employeeDao.addEmployeeInfo(employee);
        return result;
    }

    /**
     * 更新员工信息
     *
     * @param updateEmployeeInfo
     * @return
     */
    @Override
    public int editEmployeeInfo(UpdateEmployeeInfo updateEmployeeInfo) {
        int result = employeeDao.editEmployeeInfo(updateEmployeeInfo);
        return result;
    }

    /**
     * 删除员工信息
     *
     * @param updateEmployeeInfo
     * @return
     */
    @Override
    public int delEmployeeInfo(UpdateEmployeeInfo updateEmployeeInfo) {
        int result = employeeDao.delEmployeeInfo(updateEmployeeInfo);
        return result;
    }
}