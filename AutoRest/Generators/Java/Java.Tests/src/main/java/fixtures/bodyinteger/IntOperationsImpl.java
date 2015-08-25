/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.bodyinteger.models.Error;

public class IntOperationsImpl implements IntOperations {
    private IntService service;
    AutoRestIntegerTestService client;

    public IntOperationsImpl(RestAdapter restAdapter, AutoRestIntegerTestService client) {
        this.service = restAdapter.create(IntService.class);
        this.client = client;
    }

    /**
     * Get null Int value
     *
     * @return the int object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public int getNull() throws ServiceException {
        try {
            ServiceResponse<Integer> response = getNullDelegate(service.getNull(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Integer> response = getNullDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get null Int value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getNullAsync(final ServiceCallback<Integer> serviceCallback) {
        service.getNullAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getNullDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Integer> getNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Integer>()
                .register(200, new TypeToken<Integer>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get invalid Int value
     *
     * @return the int object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public int getInvalid() throws ServiceException {
        try {
            ServiceResponse<Integer> response = getInvalidDelegate(service.getInvalid(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Integer> response = getInvalidDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get invalid Int value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getInvalidAsync(final ServiceCallback<Integer> serviceCallback) {
        service.getInvalidAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getInvalidDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Integer> getInvalidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Integer>()
                .register(200, new TypeToken<Integer>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get overflow Int32 value
     *
     * @return the int object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public int getOverflowInt32() throws ServiceException {
        try {
            ServiceResponse<Integer> response = getOverflowInt32Delegate(service.getOverflowInt32(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Integer> response = getOverflowInt32Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get overflow Int32 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        service.getOverflowInt32Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getOverflowInt32Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Integer> getOverflowInt32Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Integer>()
                .register(200, new TypeToken<Integer>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get underflow Int32 value
     *
     * @return the int object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public int getUnderflowInt32() throws ServiceException {
        try {
            ServiceResponse<Integer> response = getUnderflowInt32Delegate(service.getUnderflowInt32(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Integer> response = getUnderflowInt32Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get underflow Int32 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        service.getUnderflowInt32Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getUnderflowInt32Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Integer> getUnderflowInt32Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Integer>()
                .register(200, new TypeToken<Integer>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get overflow Int64 value
     *
     * @return the long object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public long getOverflowInt64() throws ServiceException {
        try {
            ServiceResponse<Long> response = getOverflowInt64Delegate(service.getOverflowInt64(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Long> response = getOverflowInt64Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get overflow Int64 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getOverflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        service.getOverflowInt64Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getOverflowInt64Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Long> getOverflowInt64Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Long>()
                .register(200, new TypeToken<Long>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get underflow Int64 value
     *
     * @return the long object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public long getUnderflowInt64() throws ServiceException {
        try {
            ServiceResponse<Long> response = getUnderflowInt64Delegate(service.getUnderflowInt64(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Long> response = getUnderflowInt64Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Get underflow Int64 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        service.getUnderflowInt64Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getUnderflowInt64Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Long> getUnderflowInt64Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Long>()
                .register(200, new TypeToken<Long>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put max int32 value
     *
     * @param intBody the int value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putMax32(int intBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putMax32Delegate(service.putMax32(intBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putMax32Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put max int32 value
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        service.putMax32Async(intBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putMax32Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putMax32Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put max int64 value
     *
     * @param intBody the long value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putMax64(long intBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putMax64Delegate(service.putMax64(intBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putMax64Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put max int64 value
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        service.putMax64Async(intBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putMax64Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putMax64Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put min int32 value
     *
     * @param intBody the int value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putMin32(int intBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putMin32Delegate(service.putMin32(intBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putMin32Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put min int32 value
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        service.putMin32Async(intBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putMin32Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putMin32Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Put min int64 value
     *
     * @param intBody the long value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putMin64(long intBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putMin64Delegate(service.putMin64(intBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putMin64Delegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Put min int64 value
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        service.putMin64Async(intBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putMin64Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putMin64Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
