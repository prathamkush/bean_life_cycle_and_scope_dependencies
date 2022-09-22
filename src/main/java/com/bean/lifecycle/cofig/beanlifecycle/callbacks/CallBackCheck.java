package com.bean.lifecycle.cofig.beanlifecycle.callbacks;

import javax.security.auth.callback.Callback;

public class CallBackCheck {

    public interface Callback{
        void call();
    }

    public void someMethod(Callback callback, int a){
        // Step 1
        System.out.println("Hello World "+a);
        // Step 2
        callback.call(); // Functional Call

    }

    public static void main(String[] args) {
        // With lambda
        // new CallBackCheck().someMethod(() -> System.out.println("Callback Check")); // Function Definition passing it as a parameter to someMethod

        // Without lambda
        new CallBackCheck().someMethod(new Callback() {
            public void call() {
                System.out.println("Callback Check");
            }
        },5); // Function Definition passing it as a parameter to someMethod
    }






}
