package com.packt.example.authcodeserver.config;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
public class OAuth2Payload {

    String code;

    @JsonProperty("access_token")
    String accessToken;

    String access_token;

}
