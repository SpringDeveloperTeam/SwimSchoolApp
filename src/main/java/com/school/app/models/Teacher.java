package com.school.app.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
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
