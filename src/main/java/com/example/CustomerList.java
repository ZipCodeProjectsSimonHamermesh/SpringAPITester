package com.example;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by simonhamermesh on 3/3/16.
 */
@Transactional
public interface CustomerList  extends CrudRepository<CustomerWithAddress,String>{

}
