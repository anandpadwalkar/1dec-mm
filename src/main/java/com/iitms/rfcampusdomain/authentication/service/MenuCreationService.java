package com.iitms.rfcampusdomain.authentication.service;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.MenuMasterEntity;
import com.iitms.rfcampusdata.authentication.entity.RoleMenuResponse;

public interface MenuCreationService {

    public List<MenuMasterEntity> getMainMainById(int moduleId, int parentMenuId);

    public boolean addMainMenuCreation(MenuMasterEntity menuMasterEntity);

    public boolean updateMainMenuCreation(MenuMasterEntity menuMasterEntity);
    
    public List<MenuMasterEntity> getModulewiseMenu(int moduleId);

    public List<RoleMenuResponse> getModulewiseMenu(int moduleId, List<Integer> roleIds);
    
}
