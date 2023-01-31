package cn.edu.guet.springbootdemo.mapper;
import cn.edu.guet.springbootdemo.bean.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author liwei
 * @Date 2023/1/9 17:45
 * @Version 1.0
 */
@Mapper
public interface BookMapper {
    void saveBook(Book book);
    List<Book> viewBooks();
}
