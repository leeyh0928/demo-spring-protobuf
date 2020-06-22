package com.example.protobuf;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.protobuf.ProtobufTraining.*;

@RestController
@RequiredArgsConstructor
public class CourseController {
    private final CourseRepository courseRepository;

    @RequestMapping("/courses/{id}")
    Course customer(@PathVariable Integer id) {
        return courseRepository.getCourse(id);
    }
}
