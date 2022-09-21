BEAN SCOPES
——————————
Singleton,     Prototype,	 Request,		 Session, 		Application,	 WebSocket


Singleton Scope


ContentFiltering obj1 = appContextObj.getBean(ContentFiltering.class); 																		com.bean.lifecycle.config.beanlifecycle.singleton.scope.ContentFiltering@2fb68ec6
ContentFiltering obj2 = appContextObj.getBean(ContentFiltering.class);    SPRING CONTAINER => CREATES ONE SHARED INSTANCE => CACHED MEMORY 	com.bean.lifecycle.config.beanlifecycle.singleton.scope.ContentFiltering@2fb68ec6
ContentFiltering obj3 = appContextObj.getBean(ContentFiltering.class);																		com.bean.lifecycle.config.beanlifecycle.singleton.scope.ContentFiltering@2fb68ec6


Prototype Scope

ContentFiltering obj1 = appContextObj.getBean(ContentFiltering.class); 																		com.bean.lifecycle.config.beanlifecycle.singleton.scope.ContentFiltering@117632cf
ContentFiltering obj2 = appContextObj.getBean(ContentFiltering.class);  		SPRING CONTAINER => CREATES NEW BEAN INSTANCES					com.bean.lifecycle.config.beanlifecycle.singleton.scope.ContentFiltering@2fb68ec6
ContentFiltering obj3 = appContextObj.getBean(ContentFiltering.class);  																		com.bean.lifecycle.config.beanlifecycle.singleton.scope.ContentFiltering@d71adc2


Mixed Scope


SPRING CONTAINER => SINGELTON SCOPE =>  MULTI FILTERING =>  WHEN CONTENT FILTERING IS REQUESTED => PROTOTYPE BEAN


Arjun => Requesting Trailer => USA Server => Content would be retrieved => Proxy Server => Client => Arjun
Manish =>Request USA Server
Regional Cache =>
Proxy Send him back the response
Requesting Trailer => Proxy Server => Client => Manish


Singleton => Proxy Mode => Prototype By Injecting into Singleton