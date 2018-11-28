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

import java.util.HashMap;
import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;
    @Override
    public List<Employee> queryEmployeeInfos(String bankId,int page,int limit) {
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("bankId",bankId);
        map.put("page",(page-1)*limit);
        map.put("limit",limit);
        return employeeDao.queryEmployeeInfos(map);
    }

    /**
     * 获取指定银行的员工总数
     *
     * @param bankId
     * @return
     */
    @Override
    public int queryEmployeeInfosCount(String bankId) {
        return employeeDao.queryEmployeeInfosCount(bankId);
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