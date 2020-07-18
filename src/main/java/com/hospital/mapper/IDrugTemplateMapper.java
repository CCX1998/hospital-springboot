package com.hospital.mapper;

import com.hospital.domain.DrugTemplate;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author liyu
 */
@Mapper
@Repository
public interface IDrugTemplateMapper {

    @Insert("INSERT INTO drugtempl VALUES(#{presId},#{drugId},#{useWay},#{dosage},#{frequency},#{number})")
    public void insertDrugTemplate(DrugTemplate d);
}
