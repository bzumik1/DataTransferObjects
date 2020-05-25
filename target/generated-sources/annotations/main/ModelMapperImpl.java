package main;

import javax.annotation.Generated;
import main.ProductDTO.Request.Normal;
import main.ProductDTO.Request.Normal.NormalBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-25T17:16:56+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_242 (AdoptOpenJDK)"
)
public class ModelMapperImpl implements ModelMapper {

    @Override
    public Normal toProductDtoRequestNormal(Product product) {
        if ( product == null ) {
            return null;
        }

        NormalBuilder normal = Normal.builder();

        normal.name( product.getName() );
        normal.price( product.getPrice() );
        normal.cost( product.getCost() );

        return normal.build();
    }
}
