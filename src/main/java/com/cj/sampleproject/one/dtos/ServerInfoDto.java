package com.cj.sampleproject.one.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ServerInfoDto {
    private String hostName;
    private String ip;
    private String port;
    private String applicationName;
}
