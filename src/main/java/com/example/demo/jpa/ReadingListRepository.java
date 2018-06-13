package com.example.demo.jpa;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 通过扩展 JpaRepository ， ReadingListRepository 直接继承了18个执行常用持久化操作的方法
 *
 * JpaRepository<e>   仓库操作的领域对象类型，及其ID属性的类型
 */
public interface ReadingListRepository extends JpaRepository<Book, Long>{

    List<Book> findByReader(String reader);
}
