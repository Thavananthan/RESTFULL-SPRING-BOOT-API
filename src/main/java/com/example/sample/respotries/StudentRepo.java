package com.example.sample.respotries;

import com.example.sample.models.Student;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,String> {
    Student findBy_id(ObjectId _id);

}
