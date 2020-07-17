package com.hospital.controller;

import com.hospital.domain.Register;
import com.hospital.domain.User;
import com.hospital.service.impl.RegisterService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liyu
 */
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterService rs;

    @RequestMapping("/doRegister")
    public int register(Register registerdata) {
        System.out.println(registerdata);
//        Object user = model.getAttribute("user");
        int invoiceNum = rs.register(registerdata);

       return invoiceNum;
    }

    @RequestMapping("/getRegisterByMedicalRecord")
    public Register getRegisterByMedicalRecord(@RequestParam("medicalRecord") String recordNumStr) {
        int recordNum = 0;
        if (recordNumStr != null && recordNumStr.length() > 0) {
            recordNum = Integer.parseInt(recordNumStr);
        } else {
            return null;
        }
        Register record = rs.getRegisterByMedicalRecord(recordNum);
        return record;
    }
}
