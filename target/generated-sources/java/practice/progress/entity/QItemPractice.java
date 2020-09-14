package practice.progress.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QItemPractice is a Querydsl query type for ItemPractice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QItemPractice extends EntityPathBase<ItemPractice> {

    private static final long serialVersionUID = -1873146805L;

    public static final QItemPractice itemPractice = new QItemPractice("itemPractice");

    public final ListPath<CategoryPractice, QCategoryPractice> categoties = this.<CategoryPractice, QCategoryPractice>createList("categoties", CategoryPractice.class, QCategoryPractice.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Integer> stockQuantity = createNumber("stockQuantity", Integer.class);

    public QItemPractice(String variable) {
        super(ItemPractice.class, forVariable(variable));
    }

    public QItemPractice(Path<? extends ItemPractice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItemPractice(PathMetadata<?> metadata) {
        super(ItemPractice.class, metadata);
    }

}

