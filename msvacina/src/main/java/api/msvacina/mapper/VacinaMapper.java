package api.msvacina.mapper;

import api.msvacina.model.Vacina;
import io.swagger.model.VacinaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VacinaMapper {


    VacinaDTO toDTO(Vacina vacina);
}
