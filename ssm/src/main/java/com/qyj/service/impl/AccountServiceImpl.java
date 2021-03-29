package com.qyj.service.impl;

import com.qyj.domain.Account;
import com.qyj.mapper.AccountMapper;
import com.qyj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired()
    private AccountMapper accountMapper;

    @Override
    public void save(Account account){
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll(){
        return accountMapper.findAll();
    }
}
