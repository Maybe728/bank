package com.cn.bank.service;

import com.cn.bank.model.Bank;
import com.cn.bank.model.UpdateBankInfo;

import java.util.List;

public interface BankService {
    /**
     * 获取银行信息的总数
     * @return
     */
    int queryBankInfosCount();
    /**
     * 查询所有的银行信息
     * @return
     */
    List<Bank>  queryBankInfos(int page,int limit);

    /**
     * 根据经纬度查询异常银行的信息
     * @return
     */
    List<Bank>  queryExpectionBankByLatAndLng(Bank bank);


    /**
     * 根据经纬度查询银行信息
     * @return
     */
    List<Bank>  queryBankInfoByLatAndLng(Bank bank);

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
