package me.seungjun.springboot3backend.repository;

import me.seungjun.springboot3backend.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
