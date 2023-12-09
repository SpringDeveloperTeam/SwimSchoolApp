package com.school.app.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.util.List;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profesores")
public class Teacher extends Person {
    @Column(name = "profesion", nullable = false)
    private String profession;

    @JsonManagedReference
    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
    private List<Student> students;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_profesor")
    private List<CalendarEntity> calendarEntityList;
}
