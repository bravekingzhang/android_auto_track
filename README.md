# Android_auto_track
Android字节码插件，编译期间动态修改代码，实现自动埋点

实现效果截图：

#### 编译插装效果

![](http://snpy.in/9pG1g4)

#### 运行效果
![](http://snpy.in/uySnPp)


#### 根据[Luffy](https://github.com/JieYuShi/Luffy) 项目更改，是接入简化了。

##### 接入步骤

我这里也没有上传到公网的maven上去，只是上传到公司maven了，如果有兴趣的同学可以上传一下，不上传也可以打包到本地使用。

1、在根工程引入插件到工程中

```
buildscript {

    repositories {
        maven {
            url "http://maven.oa.com/nexus/content/groups/androidbuild"
        }
        maven {
            url uri('./snapshotRepo')
        }
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.0.0'
        classpath 'com.tencent.tip:autotrack-gradle-plugin:1.0.3-SNAPSHOT'
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

```

2、在你的app项目中引入帮助库
```
implementation 'com.tencent.tip:autotrackhelper:1.0.1-SNAPSHOT'
```

3、copy配置文件`autotract.gradle`到你的app项目中，搞定，记得在你的app的gradle文件末尾加上一句`apply from: 'autotract.gradle`

##### 上报埋点接口

上报埋点接口我放在了帮助库`autotrackhelper`中,自己实现自己的`TrackInfoUploader`将信息上报到你的后台，进行统计即可。



##### 原理了解，建议参考 [Luffy](https://github.com/JieYuShi/Luffy)





