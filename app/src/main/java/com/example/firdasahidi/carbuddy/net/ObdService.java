package com.example.firdasahidi.carbuddy.net;

/**
 * Created by FirdaRinoa on 11/7/17.
 */

import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Definition of REST service available in OBD Server.
 */
public interface ObdService {

    @POST("/")
    Response uploadReading(@Body ObdReading reading);

}
