package main;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter @Getter @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    Long id;
    String name;
    Double price;
    Double cost;
}
