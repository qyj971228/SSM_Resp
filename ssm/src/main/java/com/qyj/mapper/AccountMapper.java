package com.qyj.mapper;

import com.qyj.domain.Account;

import java.util.List;

public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();
}
