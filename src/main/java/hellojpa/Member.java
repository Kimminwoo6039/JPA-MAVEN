package hellojpa;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Member {


    @Id // PK 매핑 (프라이머리키)
    private Long id;

    @Column(name = "name") // DB 에는 name 인데 객체로는 username 으로 사용하고싶을때
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING) // enum 타입을 사용하고싶을때
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP) //날짜 타입을 사용하고싶을때
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP) //날짜 타입을 사용하고싶을때
    private Date lastModifiedDate;

    @Lob // 문자타입 clob
    private String description;

    @Transient  // DB 를 만들지 않고 메모리에서 작동되게 하는 어노테이션
    private int tte;
    public Member(){

    }
}
