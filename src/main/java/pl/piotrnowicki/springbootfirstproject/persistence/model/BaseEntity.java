package pl.piotrnowicki.springbootfirstproject.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long id;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @PrePersist
    protected void logDataBeforeInsert() {
        this.createdDate = new Date();
        this.updatedDate = new Date();
        this.active = true;
    }

    @PreUpdate
    protected void logDataBeforeUpdate() {
        this.updatedDate = new Date();
    }

}
