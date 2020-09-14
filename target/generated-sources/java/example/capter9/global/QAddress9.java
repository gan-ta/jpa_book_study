package example.capter9.global;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAddress9 is a Querydsl query type for Address9
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QAddress9 extends BeanPath<Address9> {

    private static final long serialVersionUID = -5549720L;

    public static final QAddress9 address9 = new QAddress9("address9");

    public final StringPath city = createString("city");

    public final StringPath state = createString("state");

    public final StringPath street = createString("street");

    public QAddress9(String variable) {
        super(Address9.class, forVariable(variable));
    }

    public QAddress9(Path<? extends Address9> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAddress9(PathMetadata<?> metadata) {
        super(Address9.class, metadata);
    }

}

