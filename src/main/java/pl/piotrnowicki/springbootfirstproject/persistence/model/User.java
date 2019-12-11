package pl.piotrnowicki.springbootfirstproject.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    @Column(name = "id")
//    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "author")
    private boolean author;
    @Column(name = "admin")
    private boolean admin;
}
