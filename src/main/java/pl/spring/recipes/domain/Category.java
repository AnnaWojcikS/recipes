package pl.spring.recipes.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by A.Wójcik on 02.09.2019.
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
