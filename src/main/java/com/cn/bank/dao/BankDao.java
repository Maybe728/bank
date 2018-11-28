package com.cn.bank.dao;

import com.cn.bank.model.Bank;
import com.cn.bank.model.UpdateBankInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface BankDao {

    /**
     * 获取银行信息的总数
     * @return
     */
    int queryBankInfosCount();
    /**
     * 查询所有银行的信息
     * @return
     */
    List<Bank> queryBankInfos(HashMap<String,Object> map);

    /**
     * 根据经纬度查询异常银行的信息
     * @return
     */
    List<Bank> queryExpectionBankByLatAndLng(Bank bank);

    /**
     * 根据经纬度查询银行信息
     * @return
     */
    List<Bank> queryBankInfoByLatAndLng(Bank bank);

    /**
     * 添加行社信息
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
     * 更新行社信息
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
