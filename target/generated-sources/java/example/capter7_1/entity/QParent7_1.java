package example.capter7_1.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QParent7_1 is a Querydsl query type for Parent7_1
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QParent7_1 extends EntityPathBase<Parent7_1> {

    private static final long serialVersionUID = -1344583028L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QParent7_1 parent7_1 = new QParent7_1("parent7_1");

    public final QChild7_1 child;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QParent7_1(String variable) {
        this(Parent7_1.class, forVariable(variable), INITS);
    }

    public QParent7_1(Path<? extends Parent7_1> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QParent7_1(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QParent7_1(PathMetadata<?> metadata, PathInits inits) {
        this(Parent7_1.class, metadata, inits);
    }

    public QParent7_1(Class<? extends Parent7_1> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.child = inits.isInitialized("child") ? new QChild7_1(forProperty("child")) : null;
    }

}

