package main;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * https://blog.scottlogic.com/2020/01/03/rethinking-the-java-dto.html
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("DTOs rolls!!!");

        ModelMapper modelMapper = Mappers.getMapper(ModelMapper.class);

        Product product = new Product((long) 1,"car",100000.0,50000.0);

        ProductDTO.Request.Normal productDtoRequestNormal = modelMapper.toProductDtoRequestNormal(product);

        System.out.println(productDtoRequestNormal);

    }
}
