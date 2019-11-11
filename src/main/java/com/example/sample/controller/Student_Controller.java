package com.example.sample.controller;

import com.example.sample.models.Student;
import com.example.sample.respotries.StudentRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
public class Student_Controller {

    @Autowired
    private StudentRepo stdRepo;

    //get all students
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public List<Student> getAllStuent(){
        return stdRepo.findAll();
    }

    // get by id to specified Student
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Student  getStudentById(@PathVariable("id") ObjectId _id){
        return stdRepo.findBy_id(_id);
    }

    //create students
    @RequestMapping(value = "/", method =RequestMethod.POST)
    public Student createStudet(@Valid @RequestBody Student std){
        std.set_id(ObjectId.get());
        stdRepo.save(std);
        return std;
    }

  //Update Method
    @RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
    public void updateById(@PathVariable("id") ObjectId _id, @Valid @RequestBody Student std){
        std.set_id(_id);
        stdRepo.save(std);
    }

    //Delete method
    @RequestMapping(value = "/delete/{id}" ,method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") ObjectId _id){
        stdRepo.delete(stdRepo.findBy_id(_id));
    }



}
