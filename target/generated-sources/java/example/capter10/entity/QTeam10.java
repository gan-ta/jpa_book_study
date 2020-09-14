package example.capter10.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTeam10 is a Querydsl query type for Team10
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTeam10 extends EntityPathBase<Team10> {

    private static final long serialVersionUID = 1992013387L;

    public static final QTeam10 team10 = new QTeam10("team10");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Member10, example.capter10.entity.QMember10> members = this.<Member10, example.capter10.entity.QMember10>createList("members", Member10.class, example.capter10.entity.QMember10.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QTeam10(String variable) {
        super(Team10.class, forVariable(variable));
    }

    public QTeam10(Path<? extends Team10> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeam10(PathMetadata<?> metadata) {
        super(Team10.class, metadata);
    }

}

