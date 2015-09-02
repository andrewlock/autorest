/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.Header;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionDefault.
 */
public interface ApiVersionDefault {
    /**
     * The interface defining all the services for ApiVersionDefault to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiVersionDefaultService {
        @GET("/azurespecials/apiVersion/method/string/none/query/global/2015-07-01-preview")
        Response getMethodGlobalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/azurespecials/apiVersion/method/string/none/query/global/2015-07-01-preview")
        void getMethodGlobalValidAsync(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/azurespecials/apiVersion/method/string/none/query/globalNotProvided/2015-07-01-preview")
        Response getMethodGlobalNotProvidedValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/azurespecials/apiVersion/method/string/none/query/globalNotProvided/2015-07-01-preview")
        void getMethodGlobalNotProvidedValidAsync(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/azurespecials/apiVersion/path/string/none/query/global/2015-07-01-preview")
        Response getPathGlobalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/azurespecials/apiVersion/path/string/none/query/global/2015-07-01-preview")
        void getPathGlobalValidAsync(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/azurespecials/apiVersion/swagger/string/none/query/global/2015-07-01-preview")
        Response getSwaggerGlobalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/azurespecials/apiVersion/swagger/string/none/query/global/2015-07-01-preview")
        void getSwaggerGlobalValidAsync(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

    }
    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getMethodGlobalValid() throws ServiceException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getMethodGlobalNotProvidedValid() throws ServiceException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getPathGlobalValid() throws ServiceException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getSwaggerGlobalValid() throws ServiceException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

}