package practice.progress.global;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAddressPractice is a Querydsl query type for AddressPractice
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QAddressPractice extends BeanPath<AddressPractice> {

    private static final long serialVersionUID = 864564498L;

    public static final QAddressPractice addressPractice = new QAddressPractice("addressPractice");

    public final StringPath city = createString("city");

    public final StringPath street = createString("street");

    public final StringPath zipcode = createString("zipcode");

    public QAddressPractice(String variable) {
        super(AddressPractice.class, forVariable(variable));
    }

    public QAddressPractice(Path<? extends AddressPractice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAddressPractice(PathMetadata<?> metadata) {
        super(AddressPractice.class, metadata);
    }

}

