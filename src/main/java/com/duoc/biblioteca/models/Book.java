package com.duoc.biblioteca.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String name;
    private String editorial;
    private int publishDate;
    private String author;
}
