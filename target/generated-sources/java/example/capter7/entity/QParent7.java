package example.capter7.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QParent7 is a Querydsl query type for Parent7
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QParent7 extends EntityPathBase<Parent7> {

    private static final long serialVersionUID = -787897780L;

    public static final QParent7 parent7 = new QParent7("parent7");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public QParent7(String variable) {
        super(Parent7.class, forVariable(variable));
    }

    public QParent7(Path<? extends Parent7> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParent7(PathMetadata<?> metadata) {
        super(Parent7.class, metadata);
    }

}

