package cn.ecomb.lib.core.bean;

import cn.ecomb.common.hibernate.LongIdBaseEntity;

import javax.persistence.Entity;

/**
 * Created by zhouzg on 2017/3/24.
 */
@Entity
public class User extends LongIdBaseEntity{
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private long id;

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
