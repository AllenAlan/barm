package com.barm.archetypes.api.provider;

import com.barm.archetypes.api.domain.dto.result.UserMainDTO;
import com.barm.archetypes.api.domain.dto.spec.UserMainSpec;
import com.github.pagehelper.PageInfo;

public interface UserMainProvider {

    PageInfo<UserMainDTO> page(UserMainSpec spec);

}
