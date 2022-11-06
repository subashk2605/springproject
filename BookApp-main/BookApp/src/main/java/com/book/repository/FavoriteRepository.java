package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.model.Book;
import com.book.model.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite,Long>{

}
