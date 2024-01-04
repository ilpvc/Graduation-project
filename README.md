## 使用方法

### 第一步修改配置
在 `application.yml`中修改数据库相关配置，包括ip，端口，用户名和密码
`url: jdbc:mysql://192.168.10.28:3306/demo?characterEncoding=utf-8`

`driver-class-name: com.mysql.cj.jdbc.Driver` #mysql8以上选带cj的，5版本选不带cj的

`username: root`   # 数据库用户名

`password: zhl123`   # 数据库密码

同样的，打开 `src/main/java/com/example/demo/utils/` 下的Codegen文件

![](https://presenter.oss-cn-shanghai.aliyuncs.com/blog/QQ%E6%88%AA%E5%9B%BE20240104113419.png)

然后继续在下面这个方法修进行修改 **注意是createGlobalConfigUseStyle1，下面还有一个createGlobalConfigUseStyle2**
![](https://presenter.oss-cn-shanghai.aliyuncs.com/blog/image-20240104113655717.png)

这里需要你的数据库都带有前缀"t_",如果不带那就去掉这行代码 `globalConfig.setTablePrefix("t_");`
例如我有一张表为t_user，那就需要带上，如果你的表是user，那就去掉

上面还有一个设置根包按照这个设置即可
![](https://presenter.oss-cn-shanghai.aliyuncs.com/blog/image-20240104114224676.png)


## 启动代码Codegen
直接启动刚刚修改的那个文件即可，就可以直接根据数据库生成后端代码，包括增删改查。