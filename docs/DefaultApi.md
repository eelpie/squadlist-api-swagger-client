# DefaultApi

All URIs are relative to *https://api.squadlist.co.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeLogGet**](DefaultApi.md#changeLogGet) | **GET** /change-log | 
[**instancesGet**](DefaultApi.md#instancesGet) | **GET** /instances | 
[**instancesIdGet**](DefaultApi.md#instancesIdGet) | **GET** /instances/{id} | 
[**instancesInstanceBoatsGet**](DefaultApi.md#instancesInstanceBoatsGet) | **GET** /instances/{instance}/boats | 
[**instancesInstanceBoatsIdGet**](DefaultApi.md#instancesInstanceBoatsIdGet) | **GET** /instances/{instance}/boats/{id} | 
[**membersIdGet**](DefaultApi.md#membersIdGet) | **GET** /members/{id} | 
[**outingsGet**](DefaultApi.md#outingsGet) | **GET** /outings | Outings
[**outingsIdAvailabilityGet**](DefaultApi.md#outingsIdAvailabilityGet) | **GET** /outings/{id}/availability | 
[**outingsIdGet**](DefaultApi.md#outingsIdGet) | **GET** /outings/{id} | Outing
[**outingsMonthsGet**](DefaultApi.md#outingsMonthsGet) | **GET** /outings/months | Outings months
[**passwordSuggestionsGet**](DefaultApi.md#passwordSuggestionsGet) | **GET** /password-suggestions | 
[**squadsGet**](DefaultApi.md#squadsGet) | **GET** /squads | 
[**squadsIdGet**](DefaultApi.md#squadsIdGet) | **GET** /squads/{id} | 
[**subscriptionRequestsGet**](DefaultApi.md#subscriptionRequestsGet) | **GET** /subscription-requests | 
[**subscriptionRequestsIdGet**](DefaultApi.md#subscriptionRequestsIdGet) | **GET** /subscription-requests/{id} | 
[**subscriptionRequestsIdPut**](DefaultApi.md#subscriptionRequestsIdPut) | **PUT** /subscription-requests/{id} | 
[**subscriptionRequestsPost**](DefaultApi.md#subscriptionRequestsPost) | **POST** /subscription-requests | 
[**tariffsGet**](DefaultApi.md#tariffsGet) | **GET** /tariffs | 
[**verifyPost**](DefaultApi.md#verifyPost) | **POST** /verify | 


<a name="changeLogGet"></a>
# **changeLogGet**
> List&lt;Change&gt; changeLogGet()



Recent changes to the system.

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Change> result = apiInstance.changeLogGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#changeLogGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Change&gt;**](Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="instancesGet"></a>
# **instancesGet**
> List&lt;Instance&gt; instancesGet()



List of instances

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Instance> result = apiInstance.instancesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#instancesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Instance&gt;**](Instance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="instancesIdGet"></a>
# **instancesIdGet**
> Instance instancesIdGet(id)



Details of a single instance

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiClient;
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.Configuration;
//import uk.co.squadlist.client.swagger.auth.*;
//import uk.co.squadlist.client.swagger.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: api
OAuth api = (OAuth) defaultClient.getAuthentication("api");
api.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The id of the instance
try {
    Instance result = apiInstance.instancesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#instancesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the instance |

### Return type

[**Instance**](Instance.md)

### Authorization

[api](../README.md#api)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="instancesInstanceBoatsGet"></a>
# **instancesInstanceBoatsGet**
> List&lt;Boat&gt; instancesInstanceBoatsGet(instance)



List of boats for this club

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String instance = "instance_example"; // String | The id of the club
try {
    List<Boat> result = apiInstance.instancesInstanceBoatsGet(instance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#instancesInstanceBoatsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instance** | **String**| The id of the club |

### Return type

[**List&lt;Boat&gt;**](Boat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="instancesInstanceBoatsIdGet"></a>
# **instancesInstanceBoatsIdGet**
> Boat instancesInstanceBoatsIdGet(instance, id)



Details of a single boat

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String instance = "instance_example"; // String | The id of the club
String id = "id_example"; // String | The id of the boat
try {
    Boat result = apiInstance.instancesInstanceBoatsIdGet(instance, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#instancesInstanceBoatsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instance** | **String**| The id of the club |
 **id** | **String**| The id of the boat |

### Return type

[**Boat**](Boat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="membersIdGet"></a>
# **membersIdGet**
> Member membersIdGet(id)



Details of a single member

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The id of the member
try {
    Member result = apiInstance.membersIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#membersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the member |

### Return type

[**Member**](Member.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outingsGet"></a>
# **outingsGet**
> List&lt;Outing&gt; outingsGet(instance, squads, fromDate, toDate)

Outings

List outings

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String instance = "instance_example"; // String | The id of the club
String squads = "squads_example"; // String | Comma seperated list of squad ids to show outings for
OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | Start of date range to show outings for
OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | End of date range to show outings for
try {
    List<Outing> result = apiInstance.outingsGet(instance, squads, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#outingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instance** | **String**| The id of the club |
 **squads** | **String**| Comma seperated list of squad ids to show outings for |
 **fromDate** | **OffsetDateTime**| Start of date range to show outings for |
 **toDate** | **OffsetDateTime**| End of date range to show outings for |

### Return type

[**List&lt;Outing&gt;**](Outing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outingsIdAvailabilityGet"></a>
# **outingsIdAvailabilityGet**
> List&lt;Availability&gt; outingsIdAvailabilityGet(id)



List availability for this outing

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The id of the outing
try {
    List<Availability> result = apiInstance.outingsIdAvailabilityGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#outingsIdAvailabilityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the outing |

### Return type

[**List&lt;Availability&gt;**](Availability.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outingsIdGet"></a>
# **outingsIdGet**
> Outing outingsIdGet(id)

Outing

Show a single outing

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The id of the outing
try {
    Outing result = apiInstance.outingsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#outingsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the outing |

### Return type

[**Outing**](Outing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outingsMonthsGet"></a>
# **outingsMonthsGet**
> Map&lt;String, String&gt; outingsMonthsGet(instance, squads, fromDate, toDate)

Outings months

List number of outings per month

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String instance = "instance_example"; // String | The id of the club
String squads = "squads_example"; // String | Comma seperated list of squad ids to show outings for
OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | Start of date range to show outings for
OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | End of date range to show outings for
try {
    Map<String, String> result = apiInstance.outingsMonthsGet(instance, squads, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#outingsMonthsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instance** | **String**| The id of the club |
 **squads** | **String**| Comma seperated list of squad ids to show outings for |
 **fromDate** | **OffsetDateTime**| Start of date range to show outings for |
 **toDate** | **OffsetDateTime**| End of date range to show outings for |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="passwordSuggestionsGet"></a>
# **passwordSuggestionsGet**
> passwordSuggestionsGet()



Generates a list of suggested passwords

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.passwordSuggestionsGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#passwordSuggestionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="squadsGet"></a>
# **squadsGet**
> List&lt;Squad&gt; squadsGet(instance)



List of squads for this club

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String instance = "instance_example"; // String | The id of the club
try {
    List<Squad> result = apiInstance.squadsGet(instance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#squadsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instance** | **String**| The id of the club |

### Return type

[**List&lt;Squad&gt;**](Squad.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="squadsIdGet"></a>
# **squadsIdGet**
> Squad squadsIdGet(id)



Details of a single squad

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The id of the squad
try {
    Squad result = apiInstance.squadsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#squadsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the squad |

### Return type

[**Squad**](Squad.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subscriptionRequestsGet"></a>
# **subscriptionRequestsGet**
> List&lt;SubscriptionRequest&gt; subscriptionRequestsGet()



List subscription requests

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiClient;
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.Configuration;
//import uk.co.squadlist.client.swagger.auth.*;
//import uk.co.squadlist.client.swagger.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: api
OAuth api = (OAuth) defaultClient.getAuthentication("api");
api.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
try {
    List<SubscriptionRequest> result = apiInstance.subscriptionRequestsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subscriptionRequestsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SubscriptionRequest&gt;**](SubscriptionRequest.md)

### Authorization

[api](../README.md#api)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subscriptionRequestsIdGet"></a>
# **subscriptionRequestsIdGet**
> SubscriptionRequest subscriptionRequestsIdGet(id)



Details of a single new instance request

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiClient;
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.Configuration;
//import uk.co.squadlist.client.swagger.auth.*;
//import uk.co.squadlist.client.swagger.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: api
OAuth api = (OAuth) defaultClient.getAuthentication("api");
api.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The id of the new instance request
try {
    SubscriptionRequest result = apiInstance.subscriptionRequestsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subscriptionRequestsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the new instance request |

### Return type

[**SubscriptionRequest**](SubscriptionRequest.md)

### Authorization

[api](../README.md#api)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subscriptionRequestsIdPut"></a>
# **subscriptionRequestsIdPut**
> SubscriptionRequest subscriptionRequestsIdPut(id, body)



### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiClient;
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.Configuration;
//import uk.co.squadlist.client.swagger.auth.*;
//import uk.co.squadlist.client.swagger.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: api
OAuth api = (OAuth) defaultClient.getAuthentication("api");
api.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The id of the new instance request
SubscriptionRequest body = new SubscriptionRequest(); // SubscriptionRequest | New instance details
try {
    SubscriptionRequest result = apiInstance.subscriptionRequestsIdPut(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subscriptionRequestsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the new instance request |
 **body** | [**SubscriptionRequest**](SubscriptionRequest.md)| New instance details |

### Return type

[**SubscriptionRequest**](SubscriptionRequest.md)

### Authorization

[api](../README.md#api)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subscriptionRequestsPost"></a>
# **subscriptionRequestsPost**
> SubscriptionRequest subscriptionRequestsPost(body)



Request a new instance for a new club.

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiClient;
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.Configuration;
//import uk.co.squadlist.client.swagger.auth.*;
//import uk.co.squadlist.client.swagger.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: api
OAuth api = (OAuth) defaultClient.getAuthentication("api");
api.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
SubscriptionRequestSubmission body = new SubscriptionRequestSubmission(); // SubscriptionRequestSubmission | New instance details
try {
    SubscriptionRequest result = apiInstance.subscriptionRequestsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subscriptionRequestsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionRequestSubmission**](SubscriptionRequestSubmission.md)| New instance details |

### Return type

[**SubscriptionRequest**](SubscriptionRequest.md)

### Authorization

[api](../README.md#api)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tariffsGet"></a>
# **tariffsGet**
> List&lt;Tariff&gt; tariffsGet()



List of tariffs

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Tariff> result = apiInstance.tariffsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#tariffsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Tariff&gt;**](Tariff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyPost"></a>
# **verifyPost**
> Member verifyPost()



Verify a owner of an access token

### Example
```java
// Import classes:
//import uk.co.squadlist.client.swagger.ApiClient;
//import uk.co.squadlist.client.swagger.ApiException;
//import uk.co.squadlist.client.swagger.Configuration;
//import uk.co.squadlist.client.swagger.auth.*;
//import uk.co.squadlist.client.swagger.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: api
OAuth api = (OAuth) defaultClient.getAuthentication("api");
api.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
try {
    Member result = apiInstance.verifyPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#verifyPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Member**](Member.md)

### Authorization

[api](../README.md#api)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

