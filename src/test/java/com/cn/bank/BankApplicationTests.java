package com.cn.bank;

import com.cn.bank.model.Bank;
import com.cn.bank.service.BankService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankApplicationTests {

    @Autowired
    BankService bankService;
    @Test
    public void contextLoads() {
        String bankId = "88888888";
        Bank bank = new Bank();
        bank.setBankId(bankId);
        TestCase.assertNotNull(bankService.queryBankInfoByLatAndLng(bank));
    }

}
