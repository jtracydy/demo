/*
*  2018 
*/
package com.example.demo.dao;

import com.example.demo.entity.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wangdan Date: 2018/12/9 Time: 11:01
 * @version $Id$
 */

@Repository
public interface ReaderRepository extends CrudRepository<Reader,String> {

}