package com.wyh.get;

import com.wyh.get.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}