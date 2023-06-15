package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
class Student {
    private Long id;
    private String name;
}