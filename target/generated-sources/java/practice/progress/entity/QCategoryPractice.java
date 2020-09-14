package practice.progress.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCategoryPractice is a Querydsl query type for CategoryPractice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCategoryPractice extends EntityPathBase<CategoryPractice> {

    private static final long serialVersionUID = 2045738166L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCategoryPractice categoryPractice = new QCategoryPractice("categoryPractice");

    public final ListPath<CategoryPractice, QCategoryPractice> child = this.<CategoryPractice, QCategoryPractice>createList("child", CategoryPractice.class, QCategoryPractice.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<ItemPractice, QItemPractice> items = this.<ItemPractice, QItemPractice>createList("items", ItemPractice.class, QItemPractice.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final QCategoryPractice parent;

    public QCategoryPractice(String variable) {
        this(CategoryPractice.class, forVariable(variable), INITS);
    }

    public QCategoryPractice(Path<? extends CategoryPractice> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCategoryPractice(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCategoryPractice(PathMetadata<?> metadata, PathInits inits) {
        this(CategoryPractice.class, metadata, inits);
    }

    public QCategoryPractice(Class<? extends CategoryPractice> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QCategoryPractice(forProperty("parent"), inits.get("parent")) : null;
    }

}

