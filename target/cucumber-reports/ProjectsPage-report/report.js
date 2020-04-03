$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/projectsPage.feature");
formatter.feature({
  "name": "Project Page Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@projectsPageTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verifies editor is working",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@editorTest"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User opens \"login\" page",
  "keyword": "Given "
});
formatter.step({
  "name": "User logins to admin page",
  "keyword": "And "
});
formatter.step({
  "name": "User opens \"Projects\" page",
  "keyword": "And "
});
formatter.step({
  "name": "User selects week \"1\"",
  "keyword": "And "
});
formatter.step({
  "name": "User opens \"Hello World\" project",
  "keyword": "When "
});
formatter.step({
  "name": "User inputs \"\u003ccode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verifies the text \"PASS\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "code"
      ]
    },
    {
      "cells": [
        "System.out.println(\\\"Hello, World!\\\");"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifies editor is working",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@projectsPageTest"
    },
    {
      "name": "@editorTest"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"login\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_opens_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logins to admin page",
  "keyword": "And "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_logins_to_admin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"Projects\" page",
  "keyword": "And "
});
formatter.match({
  "location": "AdminHomePage_STEPS.user_opens_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects week \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectsPage_STEPS.user_selects_week(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"Hello World\" project",
  "keyword": "When "
});
formatter.match({
  "location": "ProjectsPage_STEPS.user_opens_project(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs \"System.out.println(\\\"Hello, World!\\\");\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProjectsPage_STEPS.user_inputs(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d80.0.3987.149)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-9QBFEI8F\u0027, ip: \u002710.0.0.137\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\salih\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56276}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: eca1127958b7756cb2a3934b0c1c0ff9\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\r\n\tat utils.SeleniumUtils.sendKeys(SeleniumUtils.java:61)\r\n\tat step_definitions.step_impl.ProjectsPage_Impl.inputCode(ProjectsPage_Impl.java:39)\r\n\tat step_definitions.ProjectsPage_STEPS.user_inputs(ProjectsPage_STEPS.java:28)\r\n\tat ✽.User inputs \"System.out.println(\\\"Hello, World!\\\");\"(file:src/test/resources/features/projectsPage.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verifies the text \"PASS\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminHomePage_STEPS.verifies_the_text(String)"
});
formatter.result({
  "status": "skipped"
});
});