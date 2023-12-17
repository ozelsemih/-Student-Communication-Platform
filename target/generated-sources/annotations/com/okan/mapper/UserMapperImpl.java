package com.okan.mapper;

import com.okan.model.User;
import com.okan.persistence.constants.Role;
import com.okan.persistence.domain.UserEntity;
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
public class UserMapperImpl extends UserMapper {

    @Override
    public User convert(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        User user = new User();

        user.setId( entity.getId() );
        user.setEmail( entity.getEmail() );
        user.setPassword( entity.getPassword() );
        user.setFirstName( entity.getFirstName() );
        user.setLastName( entity.getLastName() );
        if ( entity.getRole() != null ) {
            user.setRole( entity.getRole().name() );
        }

        return user;
    }

    @Override
    public UserEntity convert(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setPassword( encodePassword( user.getPassword() ) );
        userEntity.setId( user.getId() );
        userEntity.setEmail( user.getEmail() );
        userEntity.setFirstName( user.getFirstName() );
        userEntity.setLastName( user.getLastName() );
        if ( user.getRole() != null ) {
            userEntity.setRole( Enum.valueOf( Role.class, user.getRole() ) );
        }

        return userEntity;
    }

    @Override
    public List<User> convert(List<UserEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( entity.size() );
        for ( UserEntity userEntity : entity ) {
            list.add( convert( userEntity ) );
        }

        return list;
    }
}
