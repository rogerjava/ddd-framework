package com.ddd.applicaiton.converter;

import com.ddd.applicaiton.dto.RoleInfoDTO;
import com.ddd.infra.dto.RoleDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-25T21:04:32+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230213-1046, environment: Java 17.0.8 (Private Build)"
)
@Component
public class UserApplicationConverterImpl implements UserApplicationConverter {

    @Override
    public RoleDTO toRoleDTO(RoleInfoDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        RoleDTO roleDTO1 = new RoleDTO();

        roleDTO1.setCode( roleDTO.getCode() );
        roleDTO1.setName( roleDTO.getName() );
        roleDTO1.setRoleId( roleDTO.getRoleId() );

        return roleDTO1;
    }

    @Override
    public RoleInfoDTO toRoleInfoDTO(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        RoleInfoDTO roleInfoDTO = new RoleInfoDTO();

        roleInfoDTO.setCode( roleDTO.getCode() );
        roleInfoDTO.setName( roleDTO.getName() );
        roleInfoDTO.setRoleId( roleDTO.getRoleId() );

        return roleInfoDTO;
    }
}
