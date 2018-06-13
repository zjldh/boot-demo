package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data// Lombok getter/setter
@AllArgsConstructor// Lombok 全参构造函数
@NoArgsConstructor// Lombok 添加无参构造函数，防止No default constructor for entity:  : com.example.demo.entity.Book
@Entity //JPA实体
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
