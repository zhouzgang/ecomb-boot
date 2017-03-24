package cn.ecomb.hiberate;

import javax.persistence.*;

/**
 * 所有需要使用自增数字做为主键的实体父类
 *
 * Created by zhangyoufang on 2016/9/20.
 */
@MappedSuperclass
public class LongIdBaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE, generator = "sequencer")
    @TableGenerator(name = "sequencer",
                  table = "st_sequences")
    private long id;

    public LongIdBaseEntity() {
    }

    public LongIdBaseEntity(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }
}
