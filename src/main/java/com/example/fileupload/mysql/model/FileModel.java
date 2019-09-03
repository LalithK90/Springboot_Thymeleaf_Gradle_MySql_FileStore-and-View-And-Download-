package com.example.fileupload.mysql.model;



import lombok.*;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-multiple-file-to-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/11/18
 * Time: 06.17
 */
@Entity
@Table(name = "file_model")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode( callSuper = true )
public class FileModel extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mimetype;

    @Lob
    private byte[] pic;

    public FileModel(String name, String mimetype, byte[] pic) {
        this.name = name;
        this.mimetype = mimetype;
        this.pic = pic;
    }
   /* public FileModel() {
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof FileModel) ) return false;
        if ( !super.equals(o) ) return false;
        FileModel fileModel = (FileModel) o;
        return Objects.equals(getId(), fileModel.getId()) &&
                Objects.equals(getName(), fileModel.getName()) &&
                Objects.equals(getMimetype(), fileModel.getMimetype()) &&
                Arrays.equals(getPic(), fileModel.getPic());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), getId(), getName(), getMimetype());
        result = 31 * result + Arrays.hashCode(getPic());
        return result;
    }*/
}