package com.kurdestan.bootcamp.family;

import com.kurdestan.bootcamp.employee.EmployeeMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-04T17:20:01+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class FamilyMapperImpl implements FamilyMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Family toFamily(FamilyDTO familyDTO) {
        if ( familyDTO == null ) {
            return null;
        }

        Family family = new Family();

        family.setId( familyDTO.getId() );
        family.setVersion( familyDTO.getVersion() );
        family.setCreatedDate( familyDTO.getCreatedDate() );
        family.setCreatedBy( familyDTO.getCreatedBy() );
        family.setLastModifiedDate( familyDTO.getLastModifiedDate() );
        family.setLastModifiedBy( familyDTO.getLastModifiedBy() );
        family.setFullName( familyDTO.getFullName() );
        family.setNationaCode( familyDTO.getNationaCode() );
        family.setEmployee( employeeMapper.toEmployee( familyDTO.getEmployee() ) );

        return family;
    }

    @Override
    public FamilyDTO toFamilyDTO(Family family) {
        if ( family == null ) {
            return null;
        }

        FamilyDTO familyDTO = new FamilyDTO();

        familyDTO.setVersion( family.getVersion() );
        familyDTO.setCreatedDate( family.getCreatedDate() );
        familyDTO.setCreatedBy( family.getCreatedBy() );
        familyDTO.setLastModifiedDate( family.getLastModifiedDate() );
        familyDTO.setLastModifiedBy( family.getLastModifiedBy() );
        familyDTO.setId( family.getId() );
        familyDTO.setFullName( family.getFullName() );
        familyDTO.setNationaCode( family.getNationaCode() );
        familyDTO.setEmployee( employeeMapper.toEmployeeDTO( family.getEmployee() ) );

        return familyDTO;
    }

    @Override
    public List<FamilyDTO> toFamilytDTOs(List<Family> families) {
        if ( families == null ) {
            return null;
        }

        List<FamilyDTO> list = new ArrayList<FamilyDTO>( families.size() );
        for ( Family family : families ) {
            list.add( toFamilyDTO( family ) );
        }

        return list;
    }
}
