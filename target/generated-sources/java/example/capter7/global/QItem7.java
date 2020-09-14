package example.capter7.global;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QItem7 is a Querydsl query type for Item7
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QItem7 extends EntityPathBase<Item7> {

    private static final long serialVersionUID = -909434749L;

    public static final QItem7 item7 = new QItem7("item7");

    public final NumberPath<Long> Id = createNumber("Id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public QItem7(String variable) {
        super(Item7.class, forVariable(variable));
    }

    public QItem7(Path<? extends Item7> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItem7(PathMetadata<?> metadata) {
        super(Item7.class, metadata);
    }

}

