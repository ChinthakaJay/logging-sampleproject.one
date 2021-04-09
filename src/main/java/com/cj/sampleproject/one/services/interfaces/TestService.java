package com.cj.sampleproject.one.services.interfaces;

import com.cj.sampleproject.one.dtos.ServerInfoDto;
import com.cj.sampleproject.one.exception.ServiceException;

public interface TestService {
    ServerInfoDto getServerInfo() throws ServiceException;
}
