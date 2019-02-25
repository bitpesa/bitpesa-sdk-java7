/*
 * BitPesa API
 * Reference documentation for the BitPesa API V1
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package co.bitpesa.sdk.api;

import co.bitpesa.sdk.ApiCallback;
import co.bitpesa.sdk.ApiClient;
import co.bitpesa.sdk.ApiException;
import co.bitpesa.sdk.ApiResponse;
import co.bitpesa.sdk.Configuration;
import co.bitpesa.sdk.Pair;
import co.bitpesa.sdk.ProgressRequestBody;
import co.bitpesa.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import co.bitpesa.sdk.model.AccountValidationRequest;
import co.bitpesa.sdk.model.AccountValidationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountValidationApi {
    private ApiClient apiClient;

    public AccountValidationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountValidationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for postAccountValidations
     * @param accountValidationRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * More information on account validation and bank account name enquiry
     * @see <a href="https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#bank-account-name-enquiry">Validates the existence of a bank account Documentation</a>
     */
    public okhttp3.Call postAccountValidationsCall(AccountValidationRequest accountValidationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = accountValidationRequest;

        // create path and map variables
        String localVarPath = "/account_validations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postAccountValidationsValidateBeforeCall(AccountValidationRequest accountValidationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountValidationRequest' is set
        if (accountValidationRequest == null) {
            throw new ApiException("Missing the required parameter 'accountValidationRequest' when calling postAccountValidations(Async)");
        }
        

        okhttp3.Call call = postAccountValidationsCall(accountValidationRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Validates the existence of a bank account
     * Validates the existence of a bank account and returns the associated customer name
     * @param accountValidationRequest  (required)
     * @return AccountValidationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * More information on account validation and bank account name enquiry
     * @see <a href="https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#bank-account-name-enquiry">Validates the existence of a bank account Documentation</a>
     */
    public AccountValidationResponse postAccountValidations(AccountValidationRequest accountValidationRequest) throws ApiException {
        ApiResponse<AccountValidationResponse> resp = postAccountValidationsWithHttpInfo(accountValidationRequest);
        return resp.getData();
    }

    /**
     * Validates the existence of a bank account
     * Validates the existence of a bank account and returns the associated customer name
     * @param accountValidationRequest  (required)
     * @return ApiResponse&lt;AccountValidationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * More information on account validation and bank account name enquiry
     * @see <a href="https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#bank-account-name-enquiry">Validates the existence of a bank account Documentation</a>
     */
    public ApiResponse<AccountValidationResponse> postAccountValidationsWithHttpInfo(AccountValidationRequest accountValidationRequest) throws ApiException {
        okhttp3.Call call = postAccountValidationsValidateBeforeCall(accountValidationRequest, null, null);
        Type localVarReturnType = new TypeToken<AccountValidationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Validates the existence of a bank account (asynchronously)
     * Validates the existence of a bank account and returns the associated customer name
     * @param accountValidationRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * More information on account validation and bank account name enquiry
     * @see <a href="https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#bank-account-name-enquiry">Validates the existence of a bank account Documentation</a>
     */
    public okhttp3.Call postAccountValidationsAsync(AccountValidationRequest accountValidationRequest, final ApiCallback<AccountValidationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = postAccountValidationsValidateBeforeCall(accountValidationRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountValidationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
