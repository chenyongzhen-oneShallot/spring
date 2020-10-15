package com.alibaba.spring.Dependency.setter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MenuModel {
    //菜单名称
    private String label;
    private Integer theSort;
}
