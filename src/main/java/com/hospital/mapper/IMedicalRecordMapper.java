package com.hospital.mapper;

import com.hospital.domain.MedicalRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liyu
 */
@Repository
@Mapper
public interface IMedicalRecordMapper {

    /**
     * 根据病历号获得病历
     * @param num
     * @return
     */
    @Select("SELECT * FROM medicalrecord WHERE recordnum = #{num}")
    public MedicalRecord getMedicalRecordByNum(int num);
}
