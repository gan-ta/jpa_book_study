package example.capter4.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTableBoard is a Querydsl query type for TableBoard
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTableBoard extends EntityPathBase<TableBoard> {

    private static final long serialVersionUID = 981193878L;

    public static final QTableBoard tableBoard = new QTableBoard("tableBoard");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QTableBoard(String variable) {
        super(TableBoard.class, forVariable(variable));
    }

    public QTableBoard(Path<? extends TableBoard> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTableBoard(PathMetadata<?> metadata) {
        super(TableBoard.class, metadata);
    }

}

