package example.capter5.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMember5 is a Querydsl query type for Member5
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMember5 extends EntityPathBase<Member5> {

    private static final long serialVersionUID = 1975427740L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember5 member5 = new QMember5("member5");

    public final StringPath id = createString("id");

    public final QTeam5 team;

    public final StringPath username = createString("username");

    public QMember5(String variable) {
        this(Member5.class, forVariable(variable), INITS);
    }

    public QMember5(Path<? extends Member5> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMember5(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMember5(PathMetadata<?> metadata, PathInits inits) {
        this(Member5.class, metadata, inits);
    }

    public QMember5(Class<? extends Member5> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.team = inits.isInitialized("team") ? new QTeam5(forProperty("team")) : null;
    }

}

