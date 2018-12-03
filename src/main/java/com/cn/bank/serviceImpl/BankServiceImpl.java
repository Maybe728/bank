package com.cn.bank.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.cn.bank.dao.BankDao;
import com.cn.bank.model.Bank;
import com.cn.bank.model.UpdateBankInfo;
import com.cn.bank.redis.RedisService;
import com.cn.bank.service.BankService;
import com.cn.bank.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class BankServiceImpl  implements BankService {
    @Autowired
    BankDao bankDao;
    @Autowired
    RedisService redisService;

    @Override
    public int queryBankInfosCount() {
        return bankDao.queryBankInfosCount();
    }

    @Override
    public List<Bank> queryBankInfos(int page,int limit) {
        List<Bank> result;
        String json = redisService.hget("queryBankInfos"+page,"banksInfo");
        if (json==null){
            HashMap<String,Object> map = new HashMap<String,Object>();
            map.put("page",(page-1)*limit);
            map.put("limit",limit);
            result = bankDao.queryBankInfos(map);
            redisService.hset("queryBankInfos"+page,"banksInfo", JsonUtil.objectToJson(result));
            return result;
        }else {
            //result = redisService.getJSONToObject(Bank.class,"queryBankInfos");
            result=JsonUtil.jsonToList(json,Bank.class);
            return result;
        }

    }

    /**
     * 根据经纬度查询异常银行的信息
     *
     * @return
     */
    @Override
    public List<Bank> queryExpectionBankByLatAndLng(Bank bank) {
        return bankDao.queryExpectionBankByLatAndLng(bank);
    }

    /**
     * 根据经纬度查询银行信息
     *
     * @return
     */
    @Override
    public List<Bank> queryBankInfoByLatAndLng(Bank bank) {
        return bankDao.queryBankInfoByLatAndLng(bank);
    }

    /**
     * 添加银行信息
     *
     * @param bank
     * @return
     */
    @Override
    public int addBankInfo(Bank bank) {
        int result = bankDao.addBankInfo(bank);
        return result;
    }

    /**
     * 更新银行信息经纬度
     *
     * @param bank
     * @return
     */
    @Override
    public int updateBankInfo(Bank bank) {
        int result = bankDao.updateBankInfo(bank);
        return result;
    }

    /**
     * 更新银行信息
     *
     * @param updateBankInfo
     * @return
     */
    @Override
    public int editBankInfo(UpdateBankInfo updateBankInfo) {
        int result = bankDao.editBankInfo(updateBankInfo);
        return result;
    }

    /**
     * 删除银行信息
     *
     * @param updateBankInfo
     * @return
     */
    @Override
    public int delBankInfo(UpdateBankInfo updateBankInfo) {
        int result = bankDao.delBankInfo(updateBankInfo);
        return result;
    }
}