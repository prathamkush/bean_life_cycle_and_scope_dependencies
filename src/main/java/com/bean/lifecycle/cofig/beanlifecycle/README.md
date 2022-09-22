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


----------------------------------------------------------

@ComonentScan
=> Scans specific packages

=> Filter Types
    1. Include FILTERS
        => Package to Include

    2. Exclude FILTERS
        => Package to Exclude

1. FilterType.ANNOTATION
2. FilterType.REGEX
3. FilterType.ASPECTJ
4. FilterType.ASSIGNABLE_TYPE
5. FilterType.CUSTOM

BEAN LIFE CYCLE :

Container => Bean INstanitation => Dependency Injection => Post Construct Method => Bean is Ready


Employee Management System
1. Prerequisite method before running applicaiton => Connecting to Databse => Establish a Connection => Post Construct

Lot of Methods => Adding an Employee, Update an Employee


////////////////********************/////////////////////

Connect() => Wait Time addEmployee() UpdateEmployee()

Container => Method With @PostConstructor => Bean Ready AddEmployee() UpdateEmployee() Container => Method with @PreDestroy => Bean Destroyed

Prototypes Scoped Beans

Singleton => Container => Insantiates Beans => PostConstructor => All Beans get ready => PreDestroy ConnectDatabase() => PostConstructor obj1.AddEmployee() obj1.DeleteEmployee() obj2.updateEmployee() obj2.findEmployee() DisconnectDatabase() => PreDestroy

Prototype =>Container => Instantiates Beans => Obj1 Beans Ready => Post Constructors => PreDestroy => Obj2 Beans Ready => Post Constructors => PreDestroy

ConnectDatabase() => PostConstructor obj1.AddEmployee() obj1.DeleteEmployee() DisconnectDatabase() => PreDestroy

ConnectDatabase() => PostConstructor obj2.updateEmployee() obj2.findEmployee() DisconnectDatabase() => PreDestroy


////////////////********************/////////////////////


CDI (Contexts and Dependency Injections) -> JAVA EE

-> @Named
-> @Inject
-> 