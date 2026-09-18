package com.masterclass.inventory.entity;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;
@Entity @Table(name="categories", uniqueConstraints=@UniqueConstraint(name="uk_categories_name", columnNames="name")) @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Category { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @NotBlank @Size(max=120) @Column(nullable=false,length=120) private String name; @Size(max=500) @Column(length=500) private String description; }
