package web.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastname;

    private Integer age;

    private String mail;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
//    @JoinTable(name = "users_roles",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User() {
    }

    public User(String lastname,
                Integer age, String mail,
                String password, Set<Role> roles) {
        this.lastname = lastname;
        this.age = age;
        this.mail = mail;
        this.password = password;
        this.roles = roles;
    }

    public User(Integer age, String mail,
                String password, Set<Role> roles) {
        this.age = age;
        this.mail = mail;
        this.password = password;
        this.roles = roles;
    }

    public User(String firstname, String lastname,
                Integer age, String mail,
                String password, Set<Role> roles) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.mail = mail;
        this.password = password;
        this.roles = roles;
    }

    public User(Long id, String firstname,
                String lastname, Integer age,
                String mail, String password,
                Set<Role> roles) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.mail = mail;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return mail;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    @Override
    public String toString() {
        return "User{" +
                "id: " + id +
                ", firstname: " + firstname +
                ", lastname: " + lastname +
                ", age: " + age +
                ", mail: " + mail +
                ", password: " + password +
                ", role: " + roles +
                '}' + '\'';
    }
}
