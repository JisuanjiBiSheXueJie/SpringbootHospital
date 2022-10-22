package com.gaoxin.mapper;

import com.gaoxin.entity.Lrecord;
import com.gaoxin.entity.Pay;
import com.gaoxin.entity.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LpayMapper {

    int updPay(Register register);

    int addPay(Register register);

    List<Pay> selPays(Register register);

    List<Lrecord> selSurplus(Lrecord lrecord);
}
