package com.tsekhanovich.patterns.generative.prototype;

public class CookieMachine {

    private Cookie cookie;

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return (Cookie) this.cookie.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cookie tempCookie = null;
        Cookie prot = new CoconutCookie();
        CookieMachine cookieMachine = new CookieMachine(prot);
        for (int i = 0; i < 100; i++) {
            tempCookie = cookieMachine.makeCookie();
        }
    }
}