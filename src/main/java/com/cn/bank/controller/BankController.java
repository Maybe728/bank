package com.cn.bank.controller;

import com.cn.bank.model.Bank;
import com.cn.bank.model.TempletResult;
import com.cn.bank.model.UpdateBankInfo;
import com.cn.bank.service.BankService;
import net.minidev.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BankController {

    @Autowired
    BankService bankService;

    @GetMapping("index")
    public ModelAndView index(){
        return new ModelAndView( "index");
    }

    @RequestMapping("/getBankInfos")
    public TempletResult getBankInfos(){
        TempletResult result = new TempletResult();
        List<Bank> banks = new ArrayList<Bank>();
        try{
            banks = bankService.queryBankInfos();
            result.setData(banks);
            result.setCount(banks.size());
            result.setCode(0);
            result.setMsg("success");
        }catch (Exception e){
            e.printStackTrace();
            result.setData(banks);
            result.setCount(0);
            result.setCode(1);
            result.setMsg("失败！");
        }
        return result;
    }
    @RequestMapping("/queryBankInfoByLatAndLng")
    public TempletResult queryBankInfoByLatAndLng(@RequestBody JSONObject params){
        TempletResult result = new TempletResult();
        Bank bank = new Bank();
        bank.setBankLatitude(params.getAsString("bankLatitude"));
        bank.setBankLongitude(params.getAsString("bankLongitude"));
        List<Bank> banks = new ArrayList<Bank>();
        try{
            banks = bankService.queryBankInfoByLatAndLng(bank);
            result.setData(banks);
            result.setCount(banks.size());
            result.setCode(0);
            result.setMsg("success");
        }catch (Exception e){
            e.printStackTrace();
            result.setData(banks);
            result.setCount(0);
            result.setCode(1);
            result.setMsg("失败");
        }
        return result;
    }

    @RequestMapping("/queryExpectionBankByLatAndLng")
    public TempletResult queryExpectionBankByLatAndLng(@RequestBody JSONObject params){
        TempletResult result = new TempletResult();
        Bank bank = new Bank();
        bank.setBankLatitude(params.getAsString("bankLatitude"));
        bank.setBankLongitude(params.getAsString("bankLongitude"));
        List<Bank> banks = new ArrayList<Bank>();
        try{
            banks = bankService.queryExpectionBankByLatAndLng(bank);
            result.setData(banks);
            result.setCount(banks.size());
            result.setCode(0);
            result.setMsg("success");
        }catch (Exception e){
            e.printStackTrace();
            result.setData(banks);
            result.setCount(0);
            result.setCode(1);
            result.setMsg("error");
        }
        return result;
    }

    @RequestMapping(value="/addBankInfo",method=RequestMethod.POST,produces="application/json; charset=UTF-8")
    public TempletResult addBankInfo(@RequestBody JSONObject params){
        TempletResult result = new TempletResult();
        Bank bank = new Bank();
        bank.setBankAddress(params.getAsString("bankAddress"));
        bank.setBankId(params.getAsString("bankId"));
        bank.setBankName(params.getAsString("bankName"));
        try {
            bankService.addBankInfo(bank);
            result.setCode(bank.getId());
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

    @RequestMapping(value="/editBankInfo",method=RequestMethod.POST,produces="application/json; charset=UTF-8")
    public TempletResult editBankInfo(@RequestBody JSONObject params){
        TempletResult result = new TempletResult();
        UpdateBankInfo updateBankInfo = new UpdateBankInfo();
        String field = params.getAsString("field");
        String colName=field.substring(0,4)+"_"+field.substring(4);

        updateBankInfo.setFiled(colName);
        updateBankInfo.setId(Integer.valueOf(params.getAsString("id")));
        updateBankInfo.setValue(params.getAsString("value"));
        try {
            int id = bankService.editBankInfo(updateBankInfo);
            if (id>0){
                result.setCode(0);
                result.setMsg("更新成功");
            }else {
                result.setCode(1);
                result.setMsg("更新失败");
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
    @RequestMapping(value="/delBankInfo",method=RequestMethod.POST,produces="application/json; charset=UTF-8")
    public TempletResult delBankInfo(@RequestBody JSONObject params){
        TempletResult result = new TempletResult();
        UpdateBankInfo updateBankInfo = new UpdateBankInfo();
        updateBankInfo.setId(Integer.valueOf(params.getAsString("id")));
        try {
            int id = bankService.delBankInfo(updateBankInfo);
            if (id>0){
                result.setCode(0);
                result.setMsg("删除成功");
            }else {
                result.setCode(1);
                result.setMsg("删除失败");
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
    @RequestMapping(value="/updateBankInfo",method=RequestMethod.POST,produces="application/json; charset=UTF-8")
    public TempletResult updateBankInfo(@RequestBody JSONObject params){
        TempletResult result = new TempletResult();

        Bank bank = new Bank();
        bank.setBankLatitude(params.getAsString("bankLatitude"));
        bank.setId(Integer.valueOf(params.getAsString("id")));
        bank.setBankLongitude(params.getAsString("bankLongitude"));
        try {
            bankService.updateBankInfo(bank);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  result;
    }
}
