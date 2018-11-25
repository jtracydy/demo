/*
*  2018 
*/
package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.ReadingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author wangdan Date: 2018/11/24 Time: 11:23
 * @version $Id$
 */
@Controller
@RequestMapping("/")
public class ReadingListController {

    @Autowired
    private ReadingListService ReadingListService;

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model) {
        List<Book> readingList =
                ReadingListService.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        ReadingListService.save(book);
        return "redirect:/{reader}";
    }

}