package main;

import org.mapstruct.Mapper;

@Mapper
public interface ModelMapper {

    ProductDTO.Request.Normal toProductDtoRequestNormal(Product product);

}
