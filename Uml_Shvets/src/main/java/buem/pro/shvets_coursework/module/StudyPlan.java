package buem.pro.shvets_coursework.module;

import java.time.LocalDateTime;
import java.util.Objects;

public class StudyPlan {
    private Student student;
    private  Subjects subjects;
    private String id;
    private double mark;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public StudyPlan() {
    }

    public StudyPlan(Student student, Subjects subjects, String id, double mark) {
        this.student = student;
        this.subjects = subjects;
        this.id = id;
        this.mark = mark;
    }

    public StudyPlan(Student student, Subjects subjects, String id, double mark, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.student = student;
        this.subjects = subjects;
        this.id = id;
        this.mark = mark;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyPlan studyPlan = (StudyPlan) o;
        return id.equals(studyPlan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "StudyPlan{" +
                "student=" + student +
                ", subjects=" + subjects +
                ", id='" + id + '\'' +
                ", mark=" + mark +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}


