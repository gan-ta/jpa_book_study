package example.capter7.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QParentId is a Querydsl query type for ParentId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QParentId extends BeanPath<ParentId> {

    private static final long serialVersionUID = 1344973254L;

    public static final QParentId parentId = new QParentId("parentId");

    public final StringPath id1 = createString("id1");

    public final StringPath id2 = createString("id2");

    public QParentId(String variable) {
        super(ParentId.class, forVariable(variable));
    }

    public QParentId(Path<? extends ParentId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParentId(PathMetadata<?> metadata) {
        super(ParentId.class, metadata);
    }

}

