package com.example.demo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Resume;

public interface ResumeRepository extends MongoRepository<Resume, String>{
	Resume findBy_id(ObjectId _id);
}
