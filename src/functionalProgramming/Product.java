package functionalProgramming;

import lombok.*;

/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode()*/

//@Data
@Value
public class Product {
    String name;
    int price;
    /*private final String name;

   *//* @ToString.Include*//*
    private final int price;*/

    /*public Product(@NonNull String name) {
        this.name = name;
    }*/
}
