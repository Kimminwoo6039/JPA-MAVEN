package hellojpa;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name="USERNAME")
    private String name;


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

    public Member(){

    }
}
