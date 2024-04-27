package com.jaylan.apiopenplatform.model.dto.interfaceinfo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *  创建接口时候要填入的信息
 *
 */
@Data
public class InterfaceInfoAddRequest implements Serializable {


    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

//   接口状态 默认未0 不需要输入

    /**
     * 请求类型
     */
    private String method;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}