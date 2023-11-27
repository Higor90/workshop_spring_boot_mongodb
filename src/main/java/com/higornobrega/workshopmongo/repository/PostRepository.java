package com.higornobrega.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.higornobrega.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {



}