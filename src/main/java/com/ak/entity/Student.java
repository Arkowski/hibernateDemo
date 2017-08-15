package com.ak.entity;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "course")
    private String course;

    @JoinColumn (name = "address_id")
    @OneToOne
    private Address address;

    @OneToMany (mappedBy = "student")
    private List<Book> books;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Student(Long id) {
    }

    public Student(Long id, String name, String surname, String course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCourse() {
        return course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
