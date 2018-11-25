/*
*  2018 
*/
package com.example.demo.dao;

/**
 * @author wangdan Date: 2018/11/24 Time: 11:21
 * @version $Id$
 */

import java.util.List;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);
}