package com.example.demo.repository;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByTitleBlogContaining(String titleBlog, Pageable pageable);
}
