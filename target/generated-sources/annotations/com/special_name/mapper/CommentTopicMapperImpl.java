package com.okan.mapper;

import com.okan.model.CommentTopic;
import com.okan.persistence.domain.CommentTopicEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-16T14:53:02+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class CommentTopicMapperImpl extends CommentTopicMapper {

    @Override
    public CommentTopic convert(CommentTopicEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CommentTopic commentTopic = new CommentTopic();

        commentTopic.setName( entity.getName() );
        commentTopic.setId( entity.getId() );

        return commentTopic;
    }

    @Override
    public CommentTopicEntity convert(CommentTopic entity) {
        if ( entity == null ) {
            return null;
        }

        CommentTopicEntity commentTopicEntity = new CommentTopicEntity();

        commentTopicEntity.setId( entity.getId() );
        commentTopicEntity.setName( entity.getName() );

        return commentTopicEntity;
    }

    @Override
    public List<CommentTopic> convert(List<CommentTopicEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CommentTopic> list = new ArrayList<CommentTopic>( entities.size() );
        for ( CommentTopicEntity commentTopicEntity : entities ) {
            list.add( convert( commentTopicEntity ) );
        }

        return list;
    }
}
