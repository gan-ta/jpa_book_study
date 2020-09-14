package example.capter4.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSequenceBoard is a Querydsl query type for SequenceBoard
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSequenceBoard extends EntityPathBase<SequenceBoard> {

    private static final long serialVersionUID = -1264238073L;

    public static final QSequenceBoard sequenceBoard = new QSequenceBoard("sequenceBoard");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QSequenceBoard(String variable) {
        super(SequenceBoard.class, forVariable(variable));
    }

    public QSequenceBoard(Path<? extends SequenceBoard> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSequenceBoard(PathMetadata<?> metadata) {
        super(SequenceBoard.class, metadata);
    }

}

