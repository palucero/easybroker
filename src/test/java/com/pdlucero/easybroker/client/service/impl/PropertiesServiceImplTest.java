package com.pdlucero.easybroker.client.service.impl;

import com.pdlucero.easybroker.client.dto.PropertyDTO;
import com.pdlucero.easybroker.client.dto.ResponseDTO;
import com.pdlucero.easybroker.client.feignclient.EasyBrokerPropertiesClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.*;

@ExtendWith( MockitoExtension.class )
public class PropertiesServiceImplTest {

    @InjectMocks
    private PropertiesServiceImpl propertiesService;

    @Mock
    private EasyBrokerPropertiesClient easyBrokerPropertiesClient;

    @BeforeEach
    void setUp() throws Exception
    {
        this.propertiesService = new PropertiesServiceImpl( easyBrokerPropertiesClient );
    }

    @Test
    void testListPropertiesByRangeSizeLessThanOrEqualsTo20()
    {
        ResponseDTO<List<PropertyDTO>> response = new ResponseDTO<>();
        List<PropertyDTO> listOfProperties = new ArrayList<>();
        PropertyDTO property = new PropertyDTO();
        property.setAgent( "Alejandro Blanco Zivec" );
        property.setTitle( "Casa con uso de suelo prueba" );
        property.setBedrooms( 1 );
        property.setBathrooms( 2 );
        property.setLocation( "La Punta, Cosío, Aguascalientes" );
        property.setPublicId( "EB-C0156" );
        property.setTitleImageFull( "https://assets.stagingeb.com/property_images/30156/116630/EB-C0156.png?version=1598540675" );
        property.setTitleImageThumb( "https://assets.stagingeb.com/property_images/30156/116630/EB-C0156_thumb.png?version=1598540675" );
        property.setParkingSpaces( null );
        property.setPropertyType( "Casa con uso de suelo" );
        property.setUpdatedAt( new Timestamp( new Date().getTime() ) );
        property.setShowPrices( true );
        property.setOperations( new ArrayList() );

        listOfProperties.add( property );
        response.setContent( listOfProperties );

        when( easyBrokerPropertiesClient.getProperties( propertiesService.getAuthorizationHeader(), 1, 20 ) ).thenReturn( response );

        assertTrue( propertiesService.listPropertiesByRange( 1, 20 ).size() <= 20 );

    }

}
