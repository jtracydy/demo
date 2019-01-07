/*
*  2018 
*/
package com.example.demo.service.impl;

import com.example.demo.dao.ReadingListRepository;
import com.example.demo.entity.Book;
import com.example.demo.service.ReadingListService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author wangdan Date: 2018/11/24 Time: 11:24
 * @version $Id$
 */
@Service
public class ReadingListServiceImpl implements ReadingListService{

    @Autowired
    private ReadingListRepository readingListRepository;

    @Override
    public Book save(Book book) {
        if(null == book){
            return null;
        }
        book.setCreate_time(new Date());
        book.setUpdate_time(new Date());
        return readingListRepository.save(book);
    }

    @Override
    public List<Book> findByReader(String reader) {
        if(StringUtils.isEmpty(reader)){
            return null;
        }
        return readingListRepository.findByReader(reader);
    }

}