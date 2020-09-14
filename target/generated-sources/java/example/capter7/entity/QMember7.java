package example.capter7.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMember7 is a Querydsl query type for Member7
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMember7 extends EntityPathBase<Member7> {

    private static final long serialVersionUID = 954359388L;

    public static final QMember7 member7 = new QMember7("member7");

    public final example.capter7.global.QBaseEntity _super = new example.capter7.global.QBaseEntity(this);

    public final StringPath email = createString("email");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QMember7(String variable) {
        super(Member7.class, forVariable(variable));
    }

    public QMember7(Path<? extends Member7> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember7(PathMetadata<?> metadata) {
        super(Member7.class, metadata);
    }

}

