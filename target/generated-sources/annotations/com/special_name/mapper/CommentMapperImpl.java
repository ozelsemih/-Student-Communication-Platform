package com.okan.mapper;

import com.okan.model.Comment;
import com.okan.model.CommentTopic;
import com.okan.model.Location;
import com.okan.persistence.domain.CommentEntity;
import com.okan.persistence.domain.CommentTopicEntity;
import com.okan.persistence.domain.LocationEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-16T21:57:10+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class CommentMapperImpl extends CommentMapper {

    @Override
    public Comment convert(CommentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setDate( convertDate( entity.getDate() ) );
        comment.setId( entity.getId() );
        comment.setFirstName( entity.getFirstName() );
        comment.setLastName( entity.getLastName() );
        comment.setCommentTopic( commentTopicEntityToCommentTopic( entity.getCommentTopic() ) );
        comment.setComment( entity.getComment() );
        comment.setLocation( locationEntityToLocation( entity.getLocation() ) );

        return comment;
    }

    @Override
    public CommentEntity convert(Comment entity) {
        if ( entity == null ) {
            return null;
        }

        CommentEntity commentEntity = new CommentEntity();

        commentEntity.setId( entity.getId() );
        commentEntity.setFirstName( entity.getFirstName() );
        commentEntity.setLastName( entity.getLastName() );
        commentEntity.setCommentTopic( commentTopicToCommentTopicEntity( entity.getCommentTopic() ) );
        commentEntity.setComment( entity.getComment() );
        commentEntity.setLocation( locationToLocationEntity( entity.getLocation() ) );

        commentEntity.setDate( java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()) );

        return commentEntity;
    }

    @Override
    public List<Comment> convert(List<CommentEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<Comment> list = new ArrayList<Comment>( entities.size() );
        for ( CommentEntity commentEntity : entities ) {
            list.add( convert( commentEntity ) );
        }

        return list;
    }

    protected CommentTopic commentTopicEntityToCommentTopic(CommentTopicEntity commentTopicEntity) {
        if ( commentTopicEntity == null ) {
            return null;
        }

        CommentTopic commentTopic = new CommentTopic();

        commentTopic.setId( commentTopicEntity.getId() );
        commentTopic.setName( commentTopicEntity.getName() );

        return commentTopic;
    }

    protected Location locationEntityToLocation(LocationEntity locationEntity) {
        if ( locationEntity == null ) {
            return null;
        }

        Location location = new Location();

        location.setId( locationEntity.getId() );
        location.setName( locationEntity.getName() );
        location.setIp( locationEntity.getIp() );

        return location;
    }

    protected CommentTopicEntity commentTopicToCommentTopicEntity(CommentTopic commentTopic) {
        if ( commentTopic == null ) {
            return null;
        }

        CommentTopicEntity commentTopicEntity = new CommentTopicEntity();

        commentTopicEntity.setId( commentTopic.getId() );
        commentTopicEntity.setName( commentTopic.getName() );

        return commentTopicEntity;
    }

    protected LocationEntity locationToLocationEntity(Location location) {
        if ( location == null ) {
            return null;
        }

        LocationEntity locationEntity = new LocationEntity();

        locationEntity.setId( location.getId() );
        locationEntity.setName( location.getName() );
        locationEntity.setIp( location.getIp() );

        return locationEntity;
    }
}
