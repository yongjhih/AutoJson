# AutoJson

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-AutoJson-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/2155)
[![Download](https://api.bintray.com/packages/yongjhih/maven/AutoJson/images/download.svg) ](https://bintray.com/yongjhih/maven/AutoJson/_latestVersion)
[![JitPack](https://img.shields.io/github/tag/yongjhih/AutoJson.svg?label=JitPack)](https://jitpack.io/#yongjhih/AutoJson)
[![Build Status](https://travis-ci.org/yongjhih/AutoJson.svg)](https://travis-ci.org/yongjhih/AutoJson)
[![Join the chat at https://gitter.im/yongjhih/AutoJson](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/yongjhih/AutoJson?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![](https://avatars0.githubusercontent.com/u/5761889?v=3&s=48)](https://github.com/Wendly)
[![](https://avatars3.githubusercontent.com/u/213736?v=3&s=48)](https://github.com/yongjhih)
Contributors..

![auto-json](art/auto-json.png)

AutoValue + Json Mapper(LoganSquare).

## Usage

parse:

```java
Post post = Post.parse(jsonString);
post.id();
post.isHidden();
```
or
```java
Post post = LoganSquare.parse(jsonString, AutoJson_Post.class);
post.id();
post.isHidden();
```

serialize:

```java
Post post = Post.builder().id(1).isHidden(false).build();
String jsonString = post.serialize();
```
or
```java
String jsonString = Post.builder().id(1).isHidden(false).serailize();
```
or
```java
Post post = Post.builder().id(1).isHidden(false).build();
String jsonString = LoganSquare.serailize(post);
```

Post.java:

```java
@AutoJson
public abstract class Post {
    @Nullable
    @AutoJson.Field
    public abstract String id();

    @Nullable
    @AutoJson.Field(name = "is_hidden")
    public abstract Boolean isHidden();

    // ...

    @AutoJson.Builder
    public static abstract class Builder {
        public abstract Builder id(String id);
        public abstract Builder isHidden(Boolean isHidden);
        public static Post build();
    }
    public static Builder builder();
}
```

## Installation

via jcenter:

```gradle
repositories {
    jcenter()
    maven {
        url 'https://dl.bintray.com/yongjhih/maven/'
    }
}

dependencies {
    compile 'com.infstory:auto-json:1.0.2'
    apt 'com.infstory:auto-json-processor:1.0.2'
}
```

via jitpack.io:

```gradle
repositories {
    maven {
        url "https://jitpack.io"
    }
}

dependencies {
    compile 'com.github.yongjhih.auto-json:auto-json:-SNAPSHOT'
    apt 'com.github.yongjhih.auto-json:auto-json-processor:-SNAPSHOT'
}
```

## Credit

* https://github.com/frankiesardo/auto-parcel
* https://github.com/bluelinelabs/LoganSquare

## License

```
Copyright 2015 8tory, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
