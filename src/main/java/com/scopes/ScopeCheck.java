package com.scopes;

/*
//BEAN SCOPES :
-> Singelton, Prototype, Request, Session, Application, WebSocket


-> IN SPRING -> DEFAULT SCOPE IS SINGELTON
-> Singleton : same reference for these below (Spring Container => ContentFilterSingeltonBean Instance)
    ContentFiltering obj1 = appContextObj.getBean(ContentFiltering.class);
    ContentFiltering obj2 = appContextObj.getBean(ContentFiltering.class);
    ContentFiltering obj3 = appContextObj.getBean(ContentFiltering.class);

-> Prototype -> different references for the above objects
                when we print them
         SPRING CONTAINER => Creates NEW BEAN INSTANCES

-> Gang of Four Singleton




*/
public class ScopeCheck {
    // Members
    int a =10;

    public void add(){
        int c;

        try {

        } catch (Exception e){

        }
    }

}

// Member Variable Scope => Class Scope Check
// Method Parameter Scope => add()
// Exception Handler Parameter Scope => try{} cathc
// Local Variable  Scope
