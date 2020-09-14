package example.capter10.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMember10 is a Querydsl query type for Member10
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMember10 extends EntityPathBase<Member10> {

    private static final long serialVersionUID = -210314360L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember10 member10 = new QMember10("member10");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final example.capter10.entity.QTeam10 team;

    public final StringPath username = createString("username");

    public QMember10(String variable) {
        this(Member10.class, forVariable(variable), INITS);
    }

    public QMember10(Path<? extends Member10> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMember10(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMember10(PathMetadata<?> metadata, PathInits inits) {
        this(Member10.class, metadata, inits);
    }

    public QMember10(Class<? extends Member10> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.team = inits.isInitialized("team") ? new example.capter10.entity.QTeam10(forProperty("team")) : null;
    }

}

