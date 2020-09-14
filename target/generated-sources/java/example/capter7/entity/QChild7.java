package example.capter7.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QChild7 is a Querydsl query type for Child7
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QChild7 extends EntityPathBase<Child7> {

    private static final long serialVersionUID = 1963912508L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChild7 child7 = new QChild7("child7");

    public final QChildId id;

    public final StringPath name = createString("name");

    public final QParent7 parent;

    public QChild7(String variable) {
        this(Child7.class, forVariable(variable), INITS);
    }

    public QChild7(Path<? extends Child7> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QChild7(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QChild7(PathMetadata<?> metadata, PathInits inits) {
        this(Child7.class, metadata, inits);
    }

    public QChild7(Class<? extends Child7> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QChildId(forProperty("id")) : null;
        this.parent = inits.isInitialized("parent") ? new QParent7(forProperty("parent")) : null;
    }

}

