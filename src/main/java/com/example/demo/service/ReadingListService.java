/*
*  2018 
*/
package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;

/**
 * @author wangdan Date: 2018/11/24 Time: 11:24
 * @version $Id$
 */
public interface ReadingListService {

    Book save(Book book);

    List<Book> findByReader(String reader);
}