package com.cn.bank.service;

import com.cn.bank.model.Bank;
import com.cn.bank.model.UpdateBankInfo;

import java.util.List;

public interface BankService {
    /**
     * 查询所有的银行信息
     * @return
     */
    List<Bank>  queryBankInfos();

    /**
     * 添加银行信息
     * @param bank
     * @return
     */
    int addBankInfo(Bank bank);

    /**
     * 更新银行信息经纬度
     * @param bank
     * @return
     */
    int updateBankInfo(Bank bank);

    /**
     * 更新银行信息
     * @param updateBankInfo
     * @return
     */
    int editBankInfo(UpdateBankInfo updateBankInfo);

    /**
     * 删除银行信息
     * @param updateBankInfo
     * @return
     */
    int delBankInfo(UpdateBankInfo updateBankInfo);
}
