package example.capter7_1.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QChild7_1 is a Querydsl query type for Child7_1
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QChild7_1 extends EntityPathBase<Child7_1> {

    private static final long serialVersionUID = 1133670560L;

    public static final QChild7_1 child7_1 = new QChild7_1("child7_1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QChild7_1(String variable) {
        super(Child7_1.class, forVariable(variable));
    }

    public QChild7_1(Path<? extends Child7_1> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChild7_1(PathMetadata<?> metadata) {
        super(Child7_1.class, metadata);
    }

}

