package com.cn.bank.serviceImpl;

import com.cn.bank.dao.BankDao;
import com.cn.bank.model.Bank;
import com.cn.bank.model.UpdateBankInfo;
import com.cn.bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BankServiceImpl  implements BankService {
    @Autowired
    BankDao bankDao;
    @Override
    public List<Bank> queryBankInfos() {
        return bankDao.queryBankInfos();
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