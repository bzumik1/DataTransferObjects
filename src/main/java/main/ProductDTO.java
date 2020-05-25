package main;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public enum ProductDTO {; //this is here because we don't have any attributes
    private interface Id { @Positive Long getId(); }
    private interface Name { @NotBlank String getName(); }
    private interface Price { @Positive Double getPrice(); }
    private interface Cost { @Positive Double getCost(); }

    public enum Request{;
        @Value @Builder
        public static class Normal implements Name, Price, Cost {
            String name;
            Double price;
            Double cost;
        }
    }

    public enum Response{;
        @Value
        public static class Public implements Id, Name, Price {
            Long id;
            String name;
            Double price;
        }

        @Value public static class Private implements Id, Name, Price, Cost {
            Long id;
            String name;
            Double price;
            Double cost;
        }
    }
}
