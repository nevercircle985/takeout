package com.ljj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljj.entity.AddressBook;
import com.ljj.mapper.AddressBookMapper;
import com.ljj.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
