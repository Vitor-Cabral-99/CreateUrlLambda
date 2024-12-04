package com.rocketseat.createUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// lombok nao funcionou pra gerar os objetos da UrlData, então criei na marra
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


public class UrlData {
    String originalUrl;
    Long expirationTime;

    public UrlData() {}

    public UrlData(String originalUrl, Long expirationTime) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

}