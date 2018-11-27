package com.cn.bank.controller;

import com.cn.bank.model.*;
import com.cn.bank.service.EmployeeService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getEmployeeInfos")
    public TempletResult getEmployeeInfos(HttpServletRequest request){

        TempletResult result = new TempletResult();
        Map<String,String[]> map = request.getParameterMap();
        String bankId = map.get("bankId")[0];
        Bank bank = new Bank();
        bank.setBankId(bankId);
        List<Employee> employees = new ArrayList<Employee>();
        try{
            employees = employeeService.queryEmployeeInfos(bank);
            result.setData(employees);
            result.setCount(employees.size());
            result.setCode(0);
            result.setMsg("success");
        }catch (Exception e){
            e.printStackTrace();
            result.setData(null);
            result.setCount(0);
            result.setCode(1);
            result.setMsg("fail");
        }
        return result;
    }

    @RequestMapping(value="/addEmployeeInfo",method=RequestMethod.POST,produces="application/json; charset=UTF-8")
    public TempletResult addEmployeeInfo(@RequestBody JSONObject params,HttpServletRequest request) throws ParseException {
        TempletResult result = new TempletResult();
        Employee employee = new Employee();
        employee.setEmployeeBankId(params.getAsString("bankId"));
        employee.setEmployeeId(params.getAsString("employeeId"));
        employee.setEmployeeName(params.getAsString("employeeName"));
        employee.setEmployeeIdentity(params.getAsString("identity"));
        employee.setEmployeeRole(params.getAsString("role"));
        employee.setEmployeeInCome(params.getAsString("inCome"));
        employee.setEmployeeSpecialty(params.getAsString("specialty"));
        employee.setEmployeeAddress(params.getAsString("address"));
        String inDate = params.getAsString("inDate");
        String outDate = params.getAsString("outDate");
        String workDate = params.getAsString("workDate");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        employee.setEmployeeInDate(sdf.parse(inDate));
        employee.setEmployeeWorkDate(sdf.parse(workDate));
        employee.setEmployeeOutDate(sdf.parse(outDate));
        try {
            employeeService.addEmployeeInfo(employee);
            result.setCode(employee.getId());
            result.setMsg("添加成功");

        }catch (Exception e){
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("系统异常！");
        }
        result.setCount(0);
        result.setData(null);
        return result;
    }

    @RequestMapping(value="/editEmployeeInfo",method=RequestMethod.POST,produces="application/json; charset=UTF-8")
    public TempletResult editEmployeeInfo(@RequestBody JSONObject params){
        TempletResult result = new TempletResult();
        UpdateEmployeeInfo updateEmployeeInfo = new UpdateEmployeeInfo();
        String field = params.getAsString("field");
        String colName=field.substring(0,8)+"_"+field.substring(8);

        updateEmployeeInfo.setFiled(colName);
        updateEmployeeInfo.setId(Integer.valueOf(params.getAsString("id")));
        updateEmployeeInfo.setValue(params.getAsString("value"));
        try {
            int id = employeeService.editEmployeeInfo(updateEmployeeInfo);
            if (id>0){
                result.setCode(0);
                result.setMsg("更新员工成功");
            }else {
                result.setCode(1);
                result.setMsg("更新员工失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("系统异常！");
        }
        result.setCount(0);
        result.setData(null);
        return result;
    }
    @RequestMapping(value="/delEmployeeInfo",method=RequestMethod.POST,produces="application/json; charset=UTF-8")
    public TempletResult delEmployeeInfo(@RequestBody JSONObject params){
        TempletResult result = new TempletResult();
        UpdateEmployeeInfo updateEmployeeInfo = new UpdateEmployeeInfo();
        updateEmployeeInfo.setId(Integer.valueOf(params.getAsString("id")));
        try {
            int id = employeeService.delEmployeeInfo(updateEmployeeInfo);
            if (id>0){
                result.setCode(0);
                result.setMsg("删除员工成功");
            }else {
                result.setCode(1);
                result.setMsg("删除员工失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("系统异常！");
        }
        result.setCount(0);
        result.setData(null);
        return result;
    }
}
