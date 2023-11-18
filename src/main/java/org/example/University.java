package org.example;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.With;

import java.util.List;


@Builder
@With
@Value
public record University(String id, String name, List<Course> courseList) {
}
