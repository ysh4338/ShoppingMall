package com.example.demo.entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "postentity")
public class PostEntity {
    @Id
    private String name;
    private String image;
    private String description;
}