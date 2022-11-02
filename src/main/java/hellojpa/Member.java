package hellojpa;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Member {


    @Id // PK 매핑 (프라이머리키)
    private Long id;

    @Column(name = "name") // DB 에는 name 인데 객체로는 username 으로 사용하고싶을때
    private String username;
















    public Member(){

    }
}
