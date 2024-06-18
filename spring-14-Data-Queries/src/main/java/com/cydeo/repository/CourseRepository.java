package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.beans.JavaBean;
import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //findAll courses by category select8from courses where category=...
    List<Course> findByCategory(String category);

    //find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //Check if a course with supplied name exists.Return true if exists.false if doesnt
    boolean existsByName(String name);

    //Returns the count of courses for the given  category
    int countByCategory(String category);

    //FIND ALL THE COURSES that with the given course name
    List<Course> findByNameStartsWith(String name);

    //Find all courses by category and returns a stream
    Stream<Course> streamAllByCategory(String category);

    //
    @Query("SELECT c FROM Course c where c.category = :category and c.rating > :rating")
    List<Course> retrieveAllByCategoryAndRatingGreaterThan(@Param("category") String category,@Param("rating") int rating);





}


