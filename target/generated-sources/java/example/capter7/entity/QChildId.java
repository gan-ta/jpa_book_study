package example.capter7.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QChildId is a Querydsl query type for ChildId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QChildId extends BeanPath<ChildId> {

    private static final long serialVersionUID = 751746262L;

    public static final QChildId childId = new QChildId("childId");

    public final StringPath id = createString("id");

    public final StringPath parentId = createString("parentId");

    public QChildId(String variable) {
        super(ChildId.class, forVariable(variable));
    }

    public QChildId(Path<? extends ChildId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChildId(PathMetadata<?> metadata) {
        super(ChildId.class, metadata);
    }

}

