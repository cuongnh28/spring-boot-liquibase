package com.hhimanshu.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "books")
@Data
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(unique = true)
  private String name;

  @Column
  private String description;

  @Column(name = "written_at")
  @Temporal(TemporalType.TIME)
  private Date writtenAt;

  @ManyToOne
  @JoinColumn(name = "author")
  private Author author;

}
