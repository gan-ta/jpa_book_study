package example.capter5.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTeam5 is a Querydsl query type for Team5
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTeam5 extends EntityPathBase<Team5> {

    private static final long serialVersionUID = 1505714041L;

    public static final QTeam5 team5 = new QTeam5("team5");

    public final StringPath id = createString("id");

    public final ListPath<Member5, QMember5> members = this.<Member5, QMember5>createList("members", Member5.class, QMember5.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QTeam5(String variable) {
        super(Team5.class, forVariable(variable));
    }

    public QTeam5(Path<? extends Team5> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeam5(PathMetadata<?> metadata) {
        super(Team5.class, metadata);
    }

}

