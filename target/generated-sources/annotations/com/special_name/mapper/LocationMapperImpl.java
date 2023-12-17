package com.okan.mapper;

import com.okan.model.Location;
import com.okan.persistence.domain.LocationEntity;
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
public class LocationMapperImpl extends LocationMapper {

    @Override
    public Location convert(LocationEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Location location = new Location();

        location.setName( entity.getName() );
        location.setId( entity.getId() );
        location.setIp( entity.getIp() );

        return location;
    }

    @Override
    public LocationEntity convert(Location entity) {
        if ( entity == null ) {
            return null;
        }

        LocationEntity locationEntity = new LocationEntity();

        locationEntity.setId( entity.getId() );
        locationEntity.setName( entity.getName() );
        locationEntity.setIp( entity.getIp() );

        return locationEntity;
    }

    @Override
    public List<Location> convert(List<LocationEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<Location> list = new ArrayList<Location>( entities.size() );
        for ( LocationEntity locationEntity : entities ) {
            list.add( convert( locationEntity ) );
        }

        return list;
    }
}
