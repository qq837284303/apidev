package com.syz.service.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

/**
 * Created by K on 2020/2/20.
 * 用于前台传入分页相关信息
 */

@Data
public class PageDTO implements Serializable{


    private Integer current;

    private Integer size;

}
