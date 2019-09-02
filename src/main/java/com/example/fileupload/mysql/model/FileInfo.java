package com.example.fileupload.mysql.model;


import lombok.*;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-multiple-file-to-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/11/18
 * Time: 06.16
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class FileInfo {
    private String filename;
    private String url;
/*
    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof FileInfo) ) return false;
        FileInfo fileInfo = (FileInfo) o;
        return Objects.equals(getFilename(), fileInfo.getFilename()) &&
                Objects.equals(getUrl(), fileInfo.getUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFilename(), getUrl());
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FileInfo(String filename, String url) {
        this.filename = filename;
        this.url = url;
    }*/
}
